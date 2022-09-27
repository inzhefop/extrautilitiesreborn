package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class EnderLillySeedProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.END_STONE) {
			(itemstack).shrink(1);
			world.setBlock(new BlockPos(x, y + 1, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_1.get().defaultBlockState(), 3);
			EnderLillyGrowProcedureProcedure.execute(world, x, (y + 1), z);
		}
	}
}
