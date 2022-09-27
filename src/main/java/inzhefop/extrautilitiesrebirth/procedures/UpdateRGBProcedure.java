package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class UpdateRGBProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rgb_x_loc = 0;
		double RGB_y_loc = 0;
		double RGB_z_loc = 0;
		String generator_string = "";
		if (ExtrautilitiesrebirthModBlocks.CULINARY_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "culinary";
		} else if (ExtrautilitiesrebirthModBlocks.DEATH_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "death";
		} else if (ExtrautilitiesrebirthModBlocks.DISENCHANTMENT_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "disenchantment";
		} else if (ExtrautilitiesrebirthModBlocks.ENDER_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "ender";
		} else if (ExtrautilitiesrebirthModBlocks.TNT_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "tnt";
		} else if (ExtrautilitiesrebirthModBlocks.FROSTY_GENERATOR_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "frosty";
		} else if (ExtrautilitiesrebirthModBlocks.FURNACE_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "furnace";
		} else if (ExtrautilitiesrebirthModBlocks.HALITOSIS_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "halitosis";
		} else if (ExtrautilitiesrebirthModBlocks.NETHERSTAR_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "neatherstar";
		} else if (ExtrautilitiesrebirthModBlocks.OVERCLOCKED_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "overclocked";
		} else if (ExtrautilitiesrebirthModBlocks.PINK_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "pink";
		} else if (ExtrautilitiesrebirthModBlocks.POTION_GENERATOR_1.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "potion";
		} else if (ExtrautilitiesrebirthModBlocks.SLIMEY_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "slimey";
		} else if (ExtrautilitiesrebirthModBlocks.SURVIVAL_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "survival";
		} else if (ExtrautilitiesrebirthModBlocks.REDSTONE_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "redstone";
		} else if (ExtrautilitiesrebirthModBlocks.MAGMA_GENERATOR.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			generator_string = "magma";
		}
		rgb_x_loc = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "rbg_x");
		RGB_y_loc = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "rbg_y");
		RGB_z_loc = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "rbg_z");
		if (ExtrautilitiesrebirthModBlocks.RAINBOW_GENERATOR.get() == (world.getBlockState(new BlockPos(rgb_x_loc, RGB_y_loc, RGB_z_loc)))
				.getBlock()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(rgb_x_loc, RGB_y_loc, RGB_z_loc);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble(generator_string, (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(rgb_x_loc, RGB_y_loc, RGB_z_loc), generator_string) + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
