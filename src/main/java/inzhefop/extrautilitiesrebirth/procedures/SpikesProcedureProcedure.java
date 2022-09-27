package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class SpikesProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ExtrautilitiesrebirthModBlocks.DIAMOND_SPIKE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			entity.hurt(DamageSource.GENERIC, 12);
		} else if (ExtrautilitiesrebirthModBlocks.GOLD_SPIKE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			entity.hurt(DamageSource.GENERIC, 5);
		} else if (ExtrautilitiesrebirthModBlocks.IRON_SPIKE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			entity.hurt(DamageSource.GENERIC, 2);
		} else if (ExtrautilitiesrebirthModBlocks.WOOD_SPIKE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			entity.hurt(DamageSource.GENERIC, (float) 0.5);
		} else if (ExtrautilitiesrebirthModBlocks.STONE_SPIKE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			entity.hurt(DamageSource.GENERIC, (float) 1.2);
		}
	}
}
