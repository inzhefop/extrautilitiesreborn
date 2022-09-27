
package inzhefop.extrautilitiesrebirth.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;


import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;


import java.util.HashMap;

import inzhefop.extrautilitiesrebirth.world.inventory.ResonantorGUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ResonantorGUIScreen extends AbstractContainerScreen<ResonantorGUIMenu> {
	private final static HashMap<String, Object> guistate = ResonantorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ResonantorGUIScreen(ResonantorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("extrautilitiesrebirth:textures/screens/resonantor_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/energy_bar_holder.png"));
		this.blit(ms, this.leftPos + 151, this.topPos + 7, 0, 0, 18, 72, 18, 72);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/energybarfill.png"));
		this.blit(ms, this.leftPos + 152, this.topPos + 8, 0, 0, 16, 70, 16, 70);

		double power = new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, new BlockPos(x, y, z)) / 1428.57;
		int pwr = (int) power;

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/gray.png"));
		this.blit(ms, this.leftPos + 152, this.topPos + 8, 0, 0, 16, 70 - pwr, 16, 70 - pwr);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/arrow.png"));
		this.blit(ms, this.leftPos + 62, this.topPos + 33, 0, 0, 32, 18, 32, 18);

		double fdf = 0;
		fdf = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "ticks")) / 4.5;
		int progress = (int) fdf;

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/progress_arrow_fill.png"));
		this.blit(ms, this.leftPos + 68, this.topPos + 34, 0, 0, progress, 15, progress, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/progress_arrow_negative.png"));
		this.blit(ms, this.leftPos + 68, this.topPos + 34, 0, 0, 22, 15, 22, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/upgrade_icon.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 19, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Inventory", 7, 71, -12829636);
		this.font.draw(poseStack, "Resonator", 7, 4, -12829636);
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
