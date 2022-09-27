package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FireAxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, (y + 1), z, entity);
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, (y - 1), z, entity);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x + 1), y, z, entity);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x - 1), y, z, entity);
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, y, (z - 1), entity);
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, y, (z + 1), entity);
			}
		}
	}
}
