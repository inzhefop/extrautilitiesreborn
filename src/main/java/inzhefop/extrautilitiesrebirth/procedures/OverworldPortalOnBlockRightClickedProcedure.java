package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.network.ExtrautilitiesrebirthModVariables;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;

public class OverworldPortalOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((Level.OVERWORLD) == (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD)) {
			{
				double _setval = x;
				entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.overworld_portal_x = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = y + 1;
				entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.overworld_portal_y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = z;
				entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.overworld_portal_z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Set overworld-return-position"), (false));
		}
		if (!((Level.OVERWORLD) == (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD))) {
			if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
				ResourceKey<Level> destinationType = Level.OVERWORLD;
				if (_player.level.dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
							nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
			if (!((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_y <= 0)) {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_x + 0.5),
							((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_y + 0.5),
							((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_z + 0.5));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_x + 0.5),
								((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_y + 0.5),
								((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_z + 0.5),
								_ent.getYRot(), _ent.getXRot());
				}
			} else {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_x + 0.5),
							(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
									(int) (entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_x,
									(int) (entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_z)
									+ 0.5),
							((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_z + 0.5));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_x + 0.5),
								(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
										(int) (entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_x,
										(int) (entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_z)
										+ 0.5),
								((entity.getCapability(ExtrautilitiesrebirthModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExtrautilitiesrebirthModVariables.PlayerVariables())).overworld_portal_z + 0.5),
								_ent.getYRot(), _ent.getXRot());
				}
			}
			if (ExtrautilitiesrebirthModItems.PORTABLE_GLOBE
					.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 12000);
			}
			if (ExtrautilitiesrebirthModItems.PORTABLE_GLOBE
					.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem(), 12000);
			}
		}
	}
}
