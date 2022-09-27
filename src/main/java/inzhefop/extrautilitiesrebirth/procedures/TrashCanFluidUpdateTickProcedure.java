package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TrashCanFluidUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
			int _amount = 10000000;
			if (_ent != null)
				_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
						.ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
		}
	}
}
