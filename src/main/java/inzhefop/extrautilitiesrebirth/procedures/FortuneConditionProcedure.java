package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class FortuneConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double zblock = 0;
		double counter1 = 0;
		double yblock = 0;
		double xblock = 0;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			if (counter1 == 0) {
				xblock = x;
				yblock = y + 1;
				zblock = z;
			}
			if (counter1 == 1) {
				xblock = x;
				yblock = y - 1;
				zblock = z;
			}
			if (counter1 == 2) {
				xblock = x + 1;
				yblock = y;
				zblock = z;
			}
			if (counter1 == 3) {
				xblock = x - 1;
				yblock = y;
				zblock = z;
			}
			if (counter1 == 4) {
				xblock = x;
				yblock = y;
				zblock = z + 1;
			}
			if (counter1 == 5) {
				xblock = x;
				yblock = y;
				zblock = z - 1;
			}
			if (ExtrautilitiesrebirthModBlocks.ENDER_QUARRY.get() == (world.getBlockState(new BlockPos(xblock, yblock, zblock))).getBlock()
					&& new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(xblock, yblock, zblock), "fortune") != 0) {
				return true;
			}
			counter1 = counter1 + 1;
		}
		return false;
	}
}
