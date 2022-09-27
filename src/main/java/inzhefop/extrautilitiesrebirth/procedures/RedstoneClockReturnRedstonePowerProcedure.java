package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RedstoneClockReturnRedstonePowerProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "power")) {
			return 0;
		}
		return 15;
	}
}
