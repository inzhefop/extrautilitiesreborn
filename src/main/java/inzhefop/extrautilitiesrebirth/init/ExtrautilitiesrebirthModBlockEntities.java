
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import inzhefop.extrautilitiesrebirth.block.entity.WirelessFEBatteryBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.TrashCanFluidBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.TrashCanEnergyBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.TrashCanBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.TNTGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.SurvivalGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.StoneDrumBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.SortingMachineBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.SolarPanelBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.SlimeyGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.ResonatorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.ReinforcedDrumBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.RedstoneGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.RedstoneClockOffBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.RedstoneClockBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.RainbowGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.QuantumQuarryBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.PotionGenerator1BlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.PinkGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.OverclockedGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.NetherstarGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.MechanicalUserBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.MechanicalMinerBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.MagmaGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.LunarPanelBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.IronDrumBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.InventoryInterfaceBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.HalitosisGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.GoldChestBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.FurnaceGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.FurnaceBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.FrostyGenerator1BlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.FeTransmitterBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.EnderThermicPumpBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.EnderQuarryBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.EnderMarkerBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.EnderGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.EnchanterBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.DisenchantmentGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.DeathGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.CursedEarthBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.CulinaryGeneratorBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.CreativeEnergyStorageBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.CreativeDrumBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.CreativeChestBlockEntity;
import inzhefop.extrautilitiesrebirth.block.entity.BedrockDrumBlockEntity;
import inzhefop.extrautilitiesrebirth.ExtrautilitiesrebirthMod;

public class ExtrautilitiesrebirthModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ExtrautilitiesrebirthMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GOLD_CHEST = register("gold_chest", ExtrautilitiesrebirthModBlocks.GOLD_CHEST,
			GoldChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_CHEST = register("creative_chest", ExtrautilitiesrebirthModBlocks.CREATIVE_CHEST,
			CreativeChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_ENERGY_STORAGE = register("creative_energy_storage",
			ExtrautilitiesrebirthModBlocks.CREATIVE_ENERGY_STORAGE, CreativeEnergyStorageBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CURSED_EARTH = register("cursed_earth", ExtrautilitiesrebirthModBlocks.CURSED_EARTH,
			CursedEarthBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LUNAR_PANEL = register("lunar_panel", ExtrautilitiesrebirthModBlocks.LUNAR_PANEL,
			LunarPanelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL = register("solar_panel", ExtrautilitiesrebirthModBlocks.SOLAR_PANEL,
			SolarPanelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CULINARY_GENERATOR = register("culinary_generator",
			ExtrautilitiesrebirthModBlocks.CULINARY_GENERATOR, CulinaryGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DEATH_GENERATOR = register("death_generator",
			ExtrautilitiesrebirthModBlocks.DEATH_GENERATOR, DeathGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DISENCHANTMENT_GENERATOR = register("disenchantment_generator",
			ExtrautilitiesrebirthModBlocks.DISENCHANTMENT_GENERATOR, DisenchantmentGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDER_GENERATOR = register("ender_generator",
			ExtrautilitiesrebirthModBlocks.ENDER_GENERATOR, EnderGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TNT_GENERATOR = register("tnt_generator", ExtrautilitiesrebirthModBlocks.TNT_GENERATOR,
			TNTGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FROSTY_GENERATOR_1 = register("frosty_generator_1",
			ExtrautilitiesrebirthModBlocks.FROSTY_GENERATOR_1, FrostyGenerator1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FURNACE_GENERATOR = register("furnace_generator",
			ExtrautilitiesrebirthModBlocks.FURNACE_GENERATOR, FurnaceGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HALITOSIS_GENERATOR = register("halitosis_generator",
			ExtrautilitiesrebirthModBlocks.HALITOSIS_GENERATOR, HalitosisGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERSTAR_GENERATOR = register("netherstar_generator",
			ExtrautilitiesrebirthModBlocks.NETHERSTAR_GENERATOR, NetherstarGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OVERCLOCKED_GENERATOR = register("overclocked_generator",
			ExtrautilitiesrebirthModBlocks.OVERCLOCKED_GENERATOR, OverclockedGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PINK_GENERATOR = register("pink_generator", ExtrautilitiesrebirthModBlocks.PINK_GENERATOR,
			PinkGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POTION_GENERATOR_1 = register("potion_generator_1",
			ExtrautilitiesrebirthModBlocks.POTION_GENERATOR_1, PotionGenerator1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SLIMEY_GENERATOR = register("slimey_generator",
			ExtrautilitiesrebirthModBlocks.SLIMEY_GENERATOR, SlimeyGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SURVIVAL_GENERATOR = register("survival_generator",
			ExtrautilitiesrebirthModBlocks.SURVIVAL_GENERATOR, SurvivalGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_GENERATOR = register("redstone_generator",
			ExtrautilitiesrebirthModBlocks.REDSTONE_GENERATOR, RedstoneGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGMA_GENERATOR = register("magma_generator",
			ExtrautilitiesrebirthModBlocks.MAGMA_GENERATOR, MagmaGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RAINBOW_GENERATOR = register("rainbow_generator",
			ExtrautilitiesrebirthModBlocks.RAINBOW_GENERATOR, RainbowGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDER_QUARRY = register("ender_quarry", ExtrautilitiesrebirthModBlocks.ENDER_QUARRY,
			EnderQuarryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDER_THERMIC_PUMP = register("ender_thermic_pump",
			ExtrautilitiesrebirthModBlocks.ENDER_THERMIC_PUMP, EnderThermicPumpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_CLOCK = register("redstone_clock", ExtrautilitiesrebirthModBlocks.REDSTONE_CLOCK,
			RedstoneClockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_DRUM = register("creative_drum", ExtrautilitiesrebirthModBlocks.CREATIVE_DRUM,
			CreativeDrumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BEDROCK_DRUM = register("bedrock_drum", ExtrautilitiesrebirthModBlocks.BEDROCK_DRUM,
			BedrockDrumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REINFORCED_DRUM = register("reinforced_drum",
			ExtrautilitiesrebirthModBlocks.REINFORCED_DRUM, ReinforcedDrumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_DRUM = register("iron_drum", ExtrautilitiesrebirthModBlocks.IRON_DRUM,
			IronDrumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONE_DRUM = register("stone_drum", ExtrautilitiesrebirthModBlocks.STONE_DRUM,
			StoneDrumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MECHANICAL_MINER = register("mechanical_miner",
			ExtrautilitiesrebirthModBlocks.MECHANICAL_MINER, MechanicalMinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MECHANICAL_USER = register("mechanical_user",
			ExtrautilitiesrebirthModBlocks.MECHANICAL_USER, MechanicalUserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FURNACE = register("furnace", ExtrautilitiesrebirthModBlocks.FURNACE,
			FurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SORTING_MACHINE = register("sorting_machine",
			ExtrautilitiesrebirthModBlocks.SORTING_MACHINE, SortingMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENCHANTER = register("enchanter", ExtrautilitiesrebirthModBlocks.ENCHANTER,
			EnchanterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RESONATOR = register("resonator", ExtrautilitiesrebirthModBlocks.RESONATOR,
			ResonatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WIRELESS_FE_BATTERY = register("wireless_fe_battery",
			ExtrautilitiesrebirthModBlocks.WIRELESS_FE_BATTERY, WirelessFEBatteryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRASH_CAN = register("trash_can", ExtrautilitiesrebirthModBlocks.TRASH_CAN,
			TrashCanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRASH_CAN_ENERGY = register("trash_can_energy",
			ExtrautilitiesrebirthModBlocks.TRASH_CAN_ENERGY, TrashCanEnergyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRASH_CAN_FLUID = register("trash_can_fluid",
			ExtrautilitiesrebirthModBlocks.TRASH_CAN_FLUID, TrashCanFluidBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDER_MARKER = register("ender_marker", ExtrautilitiesrebirthModBlocks.ENDER_MARKER,
			EnderMarkerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_CLOCK_OFF = register("redstone_clock_off",
			ExtrautilitiesrebirthModBlocks.REDSTONE_CLOCK_OFF, RedstoneClockOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INVENTORY_INTERFACE = register("inventory_interface",
			ExtrautilitiesrebirthModBlocks.INVENTORY_INTERFACE, InventoryInterfaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FE_TRANSMITTER = register("fe_transmitter", ExtrautilitiesrebirthModBlocks.FE_TRANSMITTER,
			FeTransmitterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUANTUM_QUARRY = register("quantum_quarry", ExtrautilitiesrebirthModBlocks.QUANTUM_QUARRY,
			QuantumQuarryBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
