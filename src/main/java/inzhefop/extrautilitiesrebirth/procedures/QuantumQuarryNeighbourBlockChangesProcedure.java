package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class QuantumQuarryNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY_ACTUATOR.get() == (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()
				&& ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY_ACTUATOR.get() == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()
				&& ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY_ACTUATOR.get() == (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()
				&& ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY_ACTUATOR.get() == (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()
				&& ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY_ACTUATOR.get() == (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()
				&& ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY_ACTUATOR.get() == (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("assembled", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("assembled", (false));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
