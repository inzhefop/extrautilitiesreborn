package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.Container;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class SortingMachineUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState chest1 = Blocks.AIR.defaultBlockState();
		BlockState chest2 = Blocks.AIR.defaultBlockState();
		BlockState targetblock = Blocks.AIR.defaultBlockState();
		double target_x = 0;
		double target_y = 0;
		double target_z = 0;
		double slotcounter1 = 0;
		double target_x2 = 0;
		double target_y2 = 0;
		double target_z2 = 0;
		chest1 = Blocks.AIR.defaultBlockState();
		chest2 = Blocks.AIR.defaultBlockState();
		SorterTitleProcedure.execute(world, x, y, z);
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
			targetblock = (world.getBlockState(new BlockPos(x + 1, y, z)));
			target_x = x + 1;
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
			targetblock = (world.getBlockState(new BlockPos(x, y, z - 1)));
			target_x = x;
			target_y = y;
			target_z = z - 1;
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
			targetblock = (world.getBlockState(new BlockPos(x, y, z + 1)));
			target_x = x;
			target_y = y;
			target_z = z + 1;
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
			targetblock = (world.getBlockState(new BlockPos(x - 1, y, z)));
			target_x = x - 1;
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
			chest1 = targetblock;
		}
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
			target_x2 = x - 1;
			target_y2 = y;
			target_z2 = z;
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
			target_x2 = x;
			target_y2 = y;
			target_z2 = z + 1;
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
			target_x2 = x;
			target_y2 = y;
			target_z2 = z - 1;
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
			target_x2 = x + 1;
			target_y2 = y;
			target_z2 = z;
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
		}.getValue(world, new BlockPos((int) target_x2, (int) target_y2, (int) target_z2)) > 0) {
			chest2 = targetblock;
		}
		if (!(Blocks.AIR == chest1.getBlock()) && !(Blocks.AIR == chest2.getBlock()) && Items.NAME_TAG == (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 16)).getItem()) {
			slotcounter1 = 0;
			while (slotcounter1 < 15) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), (int) slotcounter1)).is(ItemTags.create(new ResourceLocation(((((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 16)).getDisplayName().getString()).substring((int) 1, (int) (((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 16)).getDisplayName().getString()).length() - 1))))
						.toLowerCase(java.util.Locale.ENGLISH))))) {
					boolean get_encr = false;
					boolean romper_value = false;
					double total_value = 0;
					double cant_value = 0;
					double total_slots = 0;
					double slot_final = 0;
					double slot_value = 0;
					double calculo_value = 0;
					double cont_value = 0;
					double z_value = 0;
					double y_value = 0;
					double x_value = 0;
					double max_value = 0;
					ItemStack item_value = ItemStack.EMPTY;
					ItemStack saved_stack = ItemStack.EMPTY;
					x_value = target_x2;
					y_value = target_y2;
					z_value = target_z2;
					cant_value = 1;
					item_value = (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) slotcounter1));
					total_slots = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							double slots = 0;
							if (blockEntity instanceof Container) {
								slots = (double) ((Container) blockEntity).getContainerSize();
							} ;
							return slots;
						}
					}.getValue(world, new BlockPos((int) x_value, (int) y_value, (int) z_value));
					for (int index0 = 0; index0 < (int) (total_slots); index0++) {
						if (cant_value > 0) {
							cont_value = 0;
							get_encr = false;
							romper_value = false;
							for (int index1 = 0; index1 < (int) (total_slots); index1++) {
								if ((item_value).getItem() == (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value)).getItem()) {
									if (!get_encr && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value) < (item_value)
											.getMaxStackSize()) {
										get_encr = true;
									}
								}
								cont_value = cont_value + 1;
							}
							cont_value = 0;
							for (int index2 = 0; index2 < (int) (total_slots); index2++) {
								if (!romper_value) {
									slot_final = new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value);
									if (slot_final == 0 && !get_encr) {
										total_value = cant_value;
										calculo_value = cant_value;
										romper_value = true;
										saved_stack = (item_value);
									}
									if (get_encr && slot_final > 0 && (new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value))
											.getItem() == (item_value).getItem() && slot_final < (item_value).getMaxStackSize()) {
										calculo_value = (item_value).getMaxStackSize() - slot_final;
										if (calculo_value < 0) {
											calculo_value = calculo_value * (-1);
										}
										if (calculo_value > cant_value) {
											calculo_value = cant_value;
										}
										total_value = slot_final + calculo_value;
										romper_value = true;
										saved_stack = (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null) {
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).copy());
													});
												}
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value));
									}
									slot_value = cont_value;
								}
								cont_value = cont_value + 1;
							}
							cant_value = cant_value - calculo_value;
							if (cant_value < 0) {
								cant_value = cant_value * (-1);
							}
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x_value, (int) y_value, (int) z_value));
								if (_ent != null) {
									final int _sltid = (int) slot_value;
									final ItemStack _setstack = (saved_stack);
									_setstack.setCount((int) total_value);
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
										}
									});
								}
							}
							if (cant_value == 0) {
								break;
							}
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = (int) slotcounter1;
							final int _amount = 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
				} else {
					boolean get_encr = false;
					boolean romper_value = false;
					double total_value = 0;
					double cant_value = 0;
					double total_slots = 0;
					double slot_final = 0;
					double slot_value = 0;
					double calculo_value = 0;
					double cont_value = 0;
					double z_value = 0;
					double y_value = 0;
					double x_value = 0;
					double max_value = 0;
					ItemStack item_value = ItemStack.EMPTY;
					ItemStack saved_stack = ItemStack.EMPTY;
					x_value = target_x;
					y_value = target_y;
					z_value = target_z;
					cant_value = 1;
					item_value = (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) slotcounter1));
					total_slots = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							double slots = 0;
							if (blockEntity instanceof Container) {
								slots = (double) ((Container) blockEntity).getContainerSize();
							} ;
							return slots;
						}
					}.getValue(world, new BlockPos((int) x_value, (int) y_value, (int) z_value));
					for (int index0 = 0; index0 < (int) (total_slots); index0++) {
						if (cant_value > 0) {
							cont_value = 0;
							get_encr = false;
							romper_value = false;
							for (int index1 = 0; index1 < (int) (total_slots); index1++) {
								if ((item_value).getItem() == (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value)).getItem()) {
									if (!get_encr && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value) < (item_value)
											.getMaxStackSize()) {
										get_encr = true;
									}
								}
								cont_value = cont_value + 1;
							}
							cont_value = 0;
							for (int index2 = 0; index2 < (int) (total_slots); index2++) {
								if (!romper_value) {
									slot_final = new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value);
									if (slot_final == 0 && !get_encr) {
										total_value = cant_value;
										calculo_value = cant_value;
										romper_value = true;
										saved_stack = (item_value);
									}
									if (get_encr && slot_final > 0 && (new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value))
											.getItem() == (item_value).getItem() && slot_final < (item_value).getMaxStackSize()) {
										calculo_value = (item_value).getMaxStackSize() - slot_final;
										if (calculo_value < 0) {
											calculo_value = calculo_value * (-1);
										}
										if (calculo_value > cant_value) {
											calculo_value = cant_value;
										}
										total_value = slot_final + calculo_value;
										romper_value = true;
										saved_stack = (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null) {
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).copy());
													});
												}
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value));
									}
									slot_value = cont_value;
								}
								cont_value = cont_value + 1;
							}
							cant_value = cant_value - calculo_value;
							if (cant_value < 0) {
								cant_value = cant_value * (-1);
							}
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x_value, (int) y_value, (int) z_value));
								if (_ent != null) {
									final int _sltid = (int) slot_value;
									final ItemStack _setstack = (saved_stack);
									_setstack.setCount((int) total_value);
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
										}
									});
								}
							}
							if (cant_value == 0) {
								break;
							}
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = (int) slotcounter1;
							final int _amount = 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
				}
				slotcounter1 = slotcounter1 + 1;
			}
		}
	}
}
