package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class SolarPanelUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double energy = 0;
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && world instanceof Level _lvl && _lvl.isDay()) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 10;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))) {
			energy = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(world, new BlockPos(x, y, z), 100000);
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) energy);
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (ExtrautilitiesrebirthModBlocks.SOLAR_PANEL.get() == (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, null)
									.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, new BlockPos(x, y, z), 100000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
									.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
		if (ExtrautilitiesrebirthModBlocks.SOLAR_PANEL.get() == (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x, y, z + 1))) {
				energy = new Object() {
					public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, null)
									.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
						return _retval.get();
					}
				}.extractEnergySimulate(world, new BlockPos(x, y, z), 100000);
				energy = new Object() {
					public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
									.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
						return _retval.get();
					}
				}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) energy);
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z + 1));
					int _amount = (int) energy;
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
	}
}
