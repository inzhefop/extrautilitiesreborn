package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Comparator;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;

public class MechanicalMinerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState targetblock = Blocks.AIR.defaultBlockState();
		ItemStack storeditem = ItemStack.EMPTY;
		double target_x = 0;
		double target_y = 0;
		double target_z = 0;
		double slotnumber = 0;
		double multiplier = 0;
		boolean freeslot = false;
		multiplier = 1;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 9)).getItem() == ExtrautilitiesrebirthModItems.SPEED_UPGRADE.get()) {
			multiplier = new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 9) * 0.4;
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 9)).getItem() == ExtrautilitiesrebirthModItems.ENCHANTED_SPEED_UPGRADE.get()) {
			multiplier = new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 9) * 0.5;
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 9)).getItem() == ExtrautilitiesrebirthModItems.SUPER_SPEED_UPGRADE.get()) {
			multiplier = new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 9) * 0.6;
		}
		if (Direction.DOWN == (new Object() {
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
			targetblock = (world.getBlockState(new BlockPos(x, y - 1, z)));
			target_x = x;
			target_y = y - 1;
			target_z = z;
		} else if (Direction.UP == (new Object() {
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
			targetblock = (world.getBlockState(new BlockPos(x, y + 1, z)));
			target_x = x;
			target_y = y + 1;
			target_z = z;
		} else if (Direction.NORTH == (new Object() {
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
			targetblock = (world.getBlockState(new BlockPos(x - 1, y, z)));
			target_x = x - 1;
			target_y = y;
			target_z = z;
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
			targetblock = (world.getBlockState(new BlockPos(x + 1, y, z)));
			target_x = x + 1;
			target_y = y;
			target_z = z;
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
			targetblock = (world.getBlockState(new BlockPos(x, y, z + 1)));
			target_x = x;
			target_y = y;
			target_z = z + 1;
		}
		if (!(targetblock.getBlock() == Blocks.AIR || targetblock.getBlock() == Blocks.BEDROCK
				|| (new ItemStack(targetblock.getBlock())).is(ItemTags.create(new ResourceLocation("forge:ungrown_ender_lilly_states")))
				|| targetblock.getBlock() == Blocks.END_PORTAL_FRAME)) {
			if (new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, new BlockPos(x, y, z)) > Math.pow(4 * multiplier, 2)) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("ticks", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "ticks") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = (int) Math.pow(4 * multiplier, 2);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("ticks", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "ticks") >= 100 / multiplier) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("ticks", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (targetblock.getBlock() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_8.get()) {
					world.destroyBlock(new BlockPos(target_x, target_y, target_z), false);
					for (int index0 = 0; index0 < (int) (9); index0++) {
						if (((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), (int) slotnumber))
								.getItem() == ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_1.get().asItem() || new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
													.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) == 0) && new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
													.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) < 64) {
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slotnumber;
									final ItemStack _setstack = new ItemStack(ExtrautilitiesrebirthModBlocks.ENDER_LILLY_STAGE_1.get());
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
														.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) + 1));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							break;
						}
						slotnumber = slotnumber + 1;
					}
					slotnumber = 0;
					for (int index1 = 0; index1 < (int) (9); index1++) {
						if (((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), (int) slotnumber)).getItem() == Items.ENDER_PEARL || new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) == 0) && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) < 64) {
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slotnumber;
									final ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
									_setstack.setCount((int) (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
														.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) + 1));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							break;
						}
						slotnumber = slotnumber + 1;
					}
				} else {
					{
						BlockPos _pos = new BlockPos(target_x, target_y, target_z);
						Block.dropResources(world.getBlockState(_pos), world, new BlockPos(target_x, target_y, target_z), null);
						world.destroyBlock(_pos, false);
					}
					{
						final Vec3 _center = new Vec3(target_x, target_y, target_z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(Blocks.AIR.asItem() == (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)
									.getItem())) {
								storeditem = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
								for (int index2 = 0; index2 < (int) (9); index2++) {
									if (((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
														.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos(x, y, z), (int) slotnumber)).getItem() == storeditem.getItem()
											|| new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) == 0) && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) < 65 - (storeditem).getCount()) {
										freeslot = true;
										break;
									}
									slotnumber = slotnumber + 1;
								}
								slotnumber = 0;
								if (freeslot) {
									if (!entityiterator.level.isClientSide())
										entityiterator.discard();
									for (int index3 = 0; index3 < (int) (9); index3++) {
										if (((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), (int) slotnumber)).getItem() == storeditem.getItem()
												|| new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(
																	capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) == 0) && new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(
																	capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) < 65 - (storeditem).getCount()) {
											{
												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
												if (_ent != null) {
													final int _slotid = (int) slotnumber;
													final ItemStack _setstack = storeditem;
													_setstack.setCount((int) (new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(
																		capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), (int) slotnumber) + (storeditem).getCount()));
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
											break;
										}
										slotnumber = slotnumber + 1;
									}
									slotnumber = 0;
								}
							}
						}
					}
				}
			}
		}
	}
}
