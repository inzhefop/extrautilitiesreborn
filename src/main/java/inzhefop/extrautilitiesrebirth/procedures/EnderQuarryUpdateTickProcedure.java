package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Container;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Comparator;

public class EnderQuarryUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean STOP = false;
		boolean fullblock = false;
		double multiplier = 0;
		double counter1 = 0;
		double yblock = 0;
		double xblock = 0;
		double slot = 0;
		double usedpower = 0;
		double repetitions = 0;
		double zblock = 0;
		double miningz = 0;
		double miningy = 0;
		double miningx = 0;
		multiplier = Math.pow(2, Math.round(new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "eqspeed")) * 0.15);
		for (int index0 = 0; index0 < (int) (multiplier); index0++) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "state") == 1) {
				if (new Object() {
					public int getEnergyStored(LevelAccessor level, BlockPos pos) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
						return _retval.get();
					}
				}.getEnergyStored(world, new BlockPos(x, y, z)) >= (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "eqpowerdrain")) * multiplier) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						int _amount = (int) ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "eqpowerdrain")) * multiplier);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					usedpower = usedpower + (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "eqpowerdrain")) * Math.pow(repetitions, 3);
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
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "ticks") >= 20 / (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "eqspeed"))) {
					multiplier = 1;
					miningx = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "xcoord");
					miningy = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "ycoord");
					miningz = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "zcoord");
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("minedblocks", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "minedblocks") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!(new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, y, z), "eqsilk"))) {
						if (!(Blocks.BEDROCK.asItem() == (new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()))
								.getItem())) {
							if (!(Blocks.AIR.asItem() == (new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()))
									.getItem())) {
								fullblock = true;
							}
							{
								BlockPos _pos = new BlockPos(miningx, miningy, miningz);
								Block.dropResources(world.getBlockState(_pos), world, new BlockPos(miningx, miningy, miningz), null);
								world.destroyBlock(_pos, false);
							}
							{
								final Vec3 _center = new Vec3(miningx, miningy, miningz);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true)
										.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(Blocks.AIR
											.asItem() == (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)
													.getItem()
											|| Blocks.BEDROCK.asItem() == (entityiterator instanceof ItemEntity _itemEnt
													? _itemEnt.getItem()
													: ItemStack.EMPTY).getItem())) {
										if ((new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()))
												.is(ItemTags.create(new ResourceLocation("forge:ores")))
												&& !((new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()))
														.getItem() == (entityiterator instanceof ItemEntity _itemEnt
																? _itemEnt.getItem()
																: ItemStack.EMPTY).getItem())) {
											multiplier = new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getTileData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), "eqfortune");
										}
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 0;
												final ItemStack _setstack = (entityiterator instanceof ItemEntity _itemEnt
														? _itemEnt.getItem()
														: ItemStack.EMPTY);
												_setstack.setCount((int) (((entityiterator instanceof ItemEntity _itemEnt
														? _itemEnt.getItem()
														: ItemStack.EMPTY)).getCount() * multiplier));
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										if (!entityiterator.level.isClientSide())
											entityiterator.discard();
									}
								}
							}
						}
					} else {
						if (!(Blocks.AIR.asItem() == (new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()))
								.getItem()
								|| Blocks.BEDROCK
										.asItem() == (new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()))
												.getItem())) {
							fullblock = true;
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = 0;
									final ItemStack _setstack = (new ItemStack(
											(world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock()));
									_setstack.setCount(
											(int) (((new ItemStack((world.getBlockState(new BlockPos(miningx, miningy, miningz))).getBlock())))
													.getCount() * multiplier));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							world.setBlock(new BlockPos(miningx, miningy, miningz), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, (miningx + 0.5), (miningy + 0.5), (miningz + 0.5), 5, 0.3, 0.3, 0.3, 0);
					if (!(new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, y, z), "eqhole")) && fullblock) {
						world.setBlock(new BlockPos(miningx, miningy, miningz), Blocks.DIRT.defaultBlockState(), 3);
					}
					if (miningy >= -60) {
						miningy = miningy - 1;
					} else {
						miningy = new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "areamaxy");
						if (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "areadirect1") == 1) {
							if (miningz > new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "areamaxz")) {
								miningz = miningz - 1;
							} else {
								miningz = new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "areaminz");
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "areadirect2") == 2) {
									if (miningx < new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "areamaxx")) {
										miningx = miningx + 1;
									} else {
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("state", 2);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								}
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "areadirect2") == 4) {
									if (miningx > new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "areamaxx")) {
										miningx = miningx - 1;
									} else {
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("state", 2);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								}
							}
						}
						if (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "areadirect1") == 3) {
							if (miningz < new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "areamaxz")) {
								miningz = miningz + 1;
							} else {
								miningz = new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "areaminz");
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "areadirect2") == 2) {
									if (miningx < new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "areamaxx")) {
										miningx = miningx + 1;
									} else {
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("state", 2);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								}
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "areadirect2") == 4) {
									if (miningx > new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "areamaxx")) {
										miningx = miningx - 1;
									} else {
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("state", 2);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								}
							}
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("xcoord", miningx);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("ycoord", miningy);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("zcoord", miningz);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
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
			}
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 0) > 0) {
				for (int index1 = 0; index1 < (int) (6); index1++) {
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
					if (new Object() {
						public boolean get_coinsidencia(ItemStack item_value, int x_value, int y_value, int z_value) {
							int cont_value_ = 0;
							boolean get_encr = false;
							for (int index0 = 0; index0 < (int) (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									double slots = 0;
									if (blockEntity instanceof Container) {
										slots = (double) ((Container) blockEntity).getContainerSize();
									} ;
									return slots;
								}
							}.getValue(world, new BlockPos((int) x_value, (int) y_value, (int) z_value))); index0++) {
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
								}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value_)).getItem()) {
									if (!get_encr) {
										get_encr = true;
									}
								}
								cont_value_ = cont_value_ + 1;
							}
							return get_encr;
						}
					}.get_coinsidencia(new ItemStack(Blocks.AIR), (int) xblock, (int) yblock, (int) zblock) || new Object() {
						public boolean get_coinsidencia(ItemStack item_value, int x_value, int y_value, int z_value) {
							int cont_value_ = 0;
							boolean get_encr = false;
							for (int index0 = 0; index0 < (int) (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									double slots = 0;
									if (blockEntity instanceof Container) {
										slots = (double) ((Container) blockEntity).getContainerSize();
									} ;
									return slots;
								}
							}.getValue(world, new BlockPos((int) x_value, (int) y_value, (int) z_value))); index0++) {
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
								}.getItemStack(world, new BlockPos((int) x_value, (int) y_value, (int) z_value), (int) cont_value_)).getItem()) {
									if (!get_encr) {
										get_encr = true;
									}
								}
								cont_value_ = cont_value_ + 1;
							}
							return get_encr;
						}
					}.get_coinsidencia((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 0)), (int) xblock, (int) yblock, (int) zblock)) {
						if (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "state") != 2 && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "state") != 0) {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("state", 1);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
						for (int index2 = 0; index2 < (int) (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								double slots = 0;
								if (blockEntity instanceof Container) {
									slots = (double) ((Container) blockEntity).getContainerSize();
								} ;
								return slots;
							}
						}.getValue(world, new BlockPos((int) xblock, (int) yblock, (int) zblock))); index2++) {
							if (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
												.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(xblock, yblock, zblock), (int) slot) <= 64 - ((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
												.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(x, y, z), 0))).getCount() && (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
												.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(xblock, yblock, zblock), (int) slot) == 0 || (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
												.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(xblock, yblock, zblock), (int) slot)).getItem() == (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
												.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem())) {
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(xblock, yblock, zblock));
									if (_ent != null) {
										final int _slotid = (int) slot;
										final ItemStack _setstack = (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 0));
										_setstack.setCount((int) (((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(xblock, yblock, zblock), (int) slot))).getCount() + ((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 0))).getCount()));
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _slotid = 0;
										final ItemStack _setstack = new ItemStack(Blocks.AIR);
										_setstack.setCount(1);
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								STOP = true;
								break;
							}
							slot = slot + 1;
						}
						slot = 0;
					}
					if (STOP) {
						break;
					}
					counter1 = counter1 + 1;
					if (counter1 == 6) {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("state", 3);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
	}
}
