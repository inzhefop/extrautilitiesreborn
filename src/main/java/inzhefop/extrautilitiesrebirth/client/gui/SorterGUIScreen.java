
package inzhefop.extrautilitiesrebirth.client.gui;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import inzhefop.extrautilitiesrebirth.world.inventory.SorterGUIMenu;
import inzhefop.extrautilitiesrebirth.procedures.TagAttentionSignReturnProcedure;
import inzhefop.extrautilitiesrebirth.procedures.Sorterchest2returnProcedure;
import inzhefop.extrautilitiesrebirth.procedures.Sorterchest1returnProcedure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SorterGUIScreen extends AbstractContainerScreen<SorterGUIMenu> {
	private final static HashMap<String, Object> guistate = SorterGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SorterGUIScreen(SorterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("extrautilitiesrebirth:textures/screens/sorter_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/screens/upgrade_icon.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/screens/name_tag.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 42, 0, 0, 16, 16, 16, 16);

		if (Sorterchest1returnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/screens/normal.png"));
			this.blit(ms, this.leftPos + 144, this.topPos + 24, 0, 0, 18, 14, 18, 14);
		}
		if (Sorterchest2returnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/screens/normal.png"));
			this.blit(ms, this.leftPos + 144, this.topPos + 42, 0, 0, 18, 14, 18, 14);
		}
		if (TagAttentionSignReturnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/screens/attention_sign.png"));
			this.blit(ms, this.leftPos + 27, this.topPos + 43, 0, 0, 4, 14, 4, 14);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Sorter [" + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "mtitle")) + "]", 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
