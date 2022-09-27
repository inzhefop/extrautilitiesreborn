package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Random;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;

@Mod.EventBusSubscriber
public class PlayerJumpsProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean damagedone = false;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ExtrautilitiesrebirthModItems.ADVANCED_CHICKEN_WING_RING.get()))
				: false) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (ExtrautilitiesrebirthModItems.ADVANCED_CHICKEN_WING_RING.get() == itemstackiterator.getItem() && !damagedone) {
							entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 1.25), (entity.getDeltaMovement().y() * 1.25),
									(entity.getLookAngle().z * 1.25)));
							damagedone = true;
							{
								ItemStack _ist = itemstackiterator;
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
						}
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ExtrautilitiesrebirthModItems.CHICKEN_WING_RING.get()))
				: false) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (ExtrautilitiesrebirthModItems.CHICKEN_WING_RING.get() == itemstackiterator.getItem() && !damagedone) {
							entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 1.1), (entity.getDeltaMovement().y() * 1.1),
									(entity.getLookAngle().z * 1.1)));
							damagedone = true;
						}
					}
				}
			}
		}
	}
}
