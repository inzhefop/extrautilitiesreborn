package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class DrumRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent(("Drum-Fill: " + (((Math.round(new Object() {
				public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
					return _retval.get();
				}
			}.getFluidTankLevel(world, new BlockPos(x, y, z), 1)) + " / ") + "" + Math.round(new Object() {
				public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
					return _retval.get();
				}
			}.getFluidTankCapacity(world, new BlockPos(x, y, z), 1))) + " mB"))), (false));
	}
}
