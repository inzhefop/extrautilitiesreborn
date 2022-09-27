package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class EnderLillyStage1BlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.END_STONE
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_CORE.get()) {
			return true;
		}
		return false;
	}
}
