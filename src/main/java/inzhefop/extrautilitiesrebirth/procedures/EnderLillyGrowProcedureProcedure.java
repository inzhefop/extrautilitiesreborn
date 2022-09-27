package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class EnderLillyGrowProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ireterations = 0;
		ireterations = 1;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_CORE.get()) {
			ireterations = 2;
		}
		for (int index0 = 0; index0 < (int) (ireterations); index0++) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_7.get()) {
				world.setBlock(new BlockPos(x, y, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_8.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_6.get()) {
				world.setBlock(new BlockPos(x, y, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_7.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_5.get()) {
				world.setBlock(new BlockPos(x, y, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_6.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_4.get()) {
				world.setBlock(new BlockPos(x, y, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_5.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_3.get()) {
				world.setBlock(new BlockPos(x, y, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_4.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_2.get()) {
				world.setBlock(new BlockPos(x, y, z), ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_3.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_1.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
