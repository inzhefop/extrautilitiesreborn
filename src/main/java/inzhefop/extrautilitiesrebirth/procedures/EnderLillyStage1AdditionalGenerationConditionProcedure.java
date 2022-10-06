package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EnderLillyStage1AdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.AIR == (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()
				&& Blocks.END_STONE == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()) {
			return true;
		}
		return false;
	}
}
