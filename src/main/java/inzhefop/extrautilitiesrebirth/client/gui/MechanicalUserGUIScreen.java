
package inzhefop.extrautilitiesrebirth.client.gui;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

import java.util.HashMap;

import inzhefop.extrautilitiesrebirth.world.inventory.MechanicalUserGUIMenu;
import inzhefop.extrautilitiesrebirth.network.MechanicalUserGUIButtonMessage;
import inzhefop.extrautilitiesrebirth.ExtrautilitiesrebirthMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MechanicalUserGUIScreen extends AbstractContainerScreen<MechanicalUserGUIMenu> {
	private final static HashMap<String, Object> guistate = MechanicalUserGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MechanicalUserGUIScreen(MechanicalUserGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("extrautilitiesrebirth:textures/screens/mechanical_user_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/upgrade_icon.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/energy_bar_holder.png"));
		this.blit(ms, this.leftPos + 150, this.topPos + 7, 0, 0, 18, 72, 18, 72);

		double power = new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, new BlockPos(x, y, z)) / 333.33;
		int pwr = (int) power;

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/energybarfill.png"));
		this.blit(ms, this.leftPos + 151, this.topPos + 8, 0, 0, 16, 70, 16, 70);

		RenderSystem.setShaderTexture(0, new ResourceLocation("extrautilitiesrebirth:textures/gray.png"));
		this.blit(ms, this.leftPos + 151, this.topPos + 8, 0, 0, 16, 70 - pwr, 16, 70 - pwr);


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
		this.font.draw(poseStack, "Machanical User", 7, 5, -12829636);
		this.font.draw(poseStack, "" + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "mode")) + "", 51, 67, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 61, 40, 20, new TextComponent("Toggle"), e -> {
			if (true) {
				ExtrautilitiesrebirthMod.PACKET_HANDLER.sendToServer(new MechanicalUserGUIButtonMessage(0, x, y, z));
				MechanicalUserGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
