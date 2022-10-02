package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.Container;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class Sorterchest2returnProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ItemStack storeditem = ItemStack.EMPTY;
		BlockState targetblock = Blocks.AIR.defaultBlockState();
		double target_x = 0;
		double target_y = 0;
		double target_z = 0;
		double multiplier = 0;
		double slotnumber = 0;
		if (Direction.NORTH == (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z)))) {
			targetblock = (world.getBlockState(new BlockPos(x - 1, y, z)));
			target_x = x - 1;
			target_y = y;
			target_z = z;
		} else if (Direction.WEST == (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z)))) {
			targetblock = (world.getBlockState(new BlockPos(x, y, z + 1)));
			target_x = x;
			target_y = y;
			target_z = z + 1;
		} else if (Direction.EAST == (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z)))) {
			targetblock = (world.getBlockState(new BlockPos(x, y, z - 1)));
			target_x = x;
			target_y = y;
			target_z = z - 1;
		} else if (Direction.SOUTH == (new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z)))) {
			targetblock = (world.getBlockState(new BlockPos(x + 1, y, z)));
			target_x = x + 1;
			target_y = y;
			target_z = z;
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				double slots = 0;
				if (blockEntity instanceof Container) {
					slots = (double) ((Container) blockEntity).getContainerSize();
				} ;
				return slots;
			}
		}.getValue(world, new BlockPos((int) target_x, (int) target_y, (int) target_z)) > 0) {
			return false;
		}
		return true;
	}
}
