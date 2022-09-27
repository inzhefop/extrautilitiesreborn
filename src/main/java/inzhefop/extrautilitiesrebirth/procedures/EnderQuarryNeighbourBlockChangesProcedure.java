package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class EnderQuarryNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean silk = false;
		boolean hole = false;
		boolean rain = false;
		double fortune = 0;
		double zblock = 0;
		double counter1 = 0;
		double yblock = 0;
		double xblock = 0;
		double powerdrain = 0;
		double speed = 0;
		powerdrain = 260;
		speed = 1;
		fortune = 1;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			if (counter1 == 0) {
				xblock = x;
				yblock = y + 1;
				zblock = z;
			}
			if (counter1 == 1) {
				xblock = x;
				yblock = y - 1;
				zblock = z;
			}
			if (counter1 == 2) {
				xblock = x + 1;
				yblock = y;
				zblock = z;
			}
			if (counter1 == 3) {
				xblock = x - 1;
				yblock = y;
				zblock = z;
			}
			if (counter1 == 4) {
				xblock = x;
				yblock = y;
				zblock = z + 1;
			}
			if (counter1 == 5) {
				xblock = x;
				yblock = y;
				zblock = z - 1;
			}
			if (ExtrautilitiesrebirthModBlocks.ENDER_QUARRY_SILK_TOUCH_UPGRADE_3.get() == (world.getBlockState(new BlockPos(xblock, yblock, zblock)))
					.getBlock()) {
				speed = speed * 2.72;
				powerdrain = powerdrain * 2;
			}
			if (ExtrautilitiesrebirthModBlocks.ENDER_QUARRY_SILK_TOUCH_UPGRADE_2.get() == (world.getBlockState(new BlockPos(xblock, yblock, zblock)))
					.getBlock()) {
				speed = speed * 2.15;
				powerdrain = powerdrain * 1.5;
			}
			if (ExtrautilitiesrebirthModBlocks.ENDER_QUARRY_SPEED_UPGRADE.get() == (world.getBlockState(new BlockPos(xblock, yblock, zblock)))
					.getBlock()) {
				speed = speed * 1.71;
				powerdrain = powerdrain * 1;
			}
			if (ExtrautilitiesrebirthModBlocks.ENDER_QUARRY_SILK_TOUCH_UPGRADE.get() == (world.getBlockState(new BlockPos(xblock, yblock, zblock)))
					.getBlock()) {
				silk = true;
				powerdrain = powerdrain * 1.5;
			}
			if (ExtrautilitiesrebirthModBlocks.ENDER_QUARRY_WORLD_HOLE_UPGRADE.get() == (world.getBlockState(new BlockPos(xblock, yblock, zblock)))
					.getBlock()) {
				hole = true;
				powerdrain = powerdrain * 1;
			}
			counter1 = counter1 + 1;
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("eqspeed", Math.round(speed));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("eqfortune", Math.round(fortune));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("eqpowerdrain", Math.round(powerdrain * 1));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putBoolean("eqhole", hole);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putBoolean("eqsilk", silk);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putBoolean("eqrainbow", rain);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
