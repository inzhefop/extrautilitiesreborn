package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class EnderMarkerOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_axe = 0;
		double seconddirec = 0;
		double scansize = 0;
		double maxz = 0;
		double maxx = 0;
		double z_axe = 0;
		double firstdirec = 0;
		double minx = 0;
		double minz = 0;
		boolean south = false;
		boolean north = false;
		boolean east = false;
		boolean west = false;
		boolean complete = false;
		scansize = 512;
		z_axe = 0;
		north = false;
		east = false;
		south = false;
		west = false;
		minz = z - 1;
		for (int index0 = 0; index0 < (int) (scansize); index0++) {
			z_axe = z_axe - 1;
			if (ExtrautilitiesrebirthModBlocks.ENDER_MARKER.get() == (world.getBlockState(new BlockPos(x, y, z + z_axe))).getBlock()) {
				maxz = z + z_axe + 1;
				north = true;
				firstdirec = 1;
				break;
			}
		}
		x_axe = 0;
		minx = x - 1;
		for (int index1 = 0; index1 < (int) (scansize); index1++) {
			x_axe = x_axe - 1;
			if (ExtrautilitiesrebirthModBlocks.ENDER_MARKER.get() == (world.getBlockState(new BlockPos(x + x_axe, y, z))).getBlock()) {
				maxx = x + x_axe + 1;
				seconddirec = 4;
				west = true;
				break;
			}
		}
		if (north == false) {
			z_axe = 0;
			minz = z + 1;
			for (int index2 = 0; index2 < (int) (scansize); index2++) {
				z_axe = z_axe + 1;
				if (ExtrautilitiesrebirthModBlocks.ENDER_MARKER.get() == (world.getBlockState(new BlockPos(x, y, z + z_axe))).getBlock()) {
					south = true;
					maxz = (z + z_axe) - 1;
					firstdirec = 3;
					break;
				}
			}
		}
		if (west == false) {
			x_axe = 0;
			minx = x + 1;
			for (int index3 = 0; index3 < (int) (scansize); index3++) {
				x_axe = x_axe + 1;
				if (ExtrautilitiesrebirthModBlocks.ENDER_MARKER.get() == (world.getBlockState(new BlockPos(x + x_axe, y, z))).getBlock()) {
					east = true;
					maxx = (x + x_axe) - 1;
					seconddirec = 2;
					break;
				}
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent((("==== Scanning (Radius: " + Math.round(scansize)) + ") ====")), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent(((("Marker [1] at " + x) + "" + (" " + y)) + "" + (" " + z))), (false));
		if (north == true || south == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(((("Marker [2] at " + x) + "" + (" " + y)) + "" + (" " + (z + z_axe)))), (false));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Missing Marker [2]"), (false));
		}
		if (east == true || west == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(((("Marker [3] at " + (x + x_axe)) + "" + (" " + y)) + "" + (" " + z))), (false));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Missing Marker [3]"), (false));
		}
		if ((north == true || south == true) && (east == true || west == true)) {
			if (ExtrautilitiesrebirthModBlocks.ENDER_MARKER.get() == (world.getBlockState(new BlockPos(x + x_axe, y, z + z_axe))).getBlock()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(((("Marker [4] at " + (x + x_axe)) + "" + (" " + y)) + "" + (" " + (z + z_axe)))),
							(false));
				complete = true;
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							new TextComponent(((("Missing Marker [4] at " + (x + x_axe)) + "" + (" " + y)) + "" + (" " + (z + z_axe)))), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Missing Marker [4]"), (false));
		}
		if (complete == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("State: \u00A7aComplete"), (false));
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("complete", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("minx", minx);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("minz", minz);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("maxx", maxx);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("maxz", maxz);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("direc1", firstdirec);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("direc2", seconddirec);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("State: \u00A7cMissing Markers"), (false));
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("complete", (false));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
