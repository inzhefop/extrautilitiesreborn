package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class GeneratorMK1PlacedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putString("machine",
						(((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock())).getDisplayName().getString()).substring((int) 1,
								(int) (((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock())).getDisplayName().getString())
										.length() - 1))));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
