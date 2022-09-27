package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FireAxeProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double y_var = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		y_var = -1;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if ((world.getBlockState(new BlockPos(x, y + y_var, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, (y + y_var), z, entity);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + y_var, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x + 1), (y + y_var), z, entity);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + y_var, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x - 1), (y + y_var), z, entity);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + y_var, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x + 1), (y + y_var), (z + 1), entity);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + y_var, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x + 1), (y + y_var), (z - 1), entity);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + y_var, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x - 1), (y + y_var), (z + 1), entity);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + y_var, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, (x - 1), (y + y_var), (z - 1), entity);
			}
			if ((world.getBlockState(new BlockPos(x, y + y_var, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, (y + y_var), (z - 1), entity);
			}
			if ((world.getBlockState(new BlockPos(x, y + y_var, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				FireAxeProcedureProcedure.execute(world, x, (y + y_var), (z + 1), entity);
			}
			y_var = y_var + 1;
		}
	}
}
