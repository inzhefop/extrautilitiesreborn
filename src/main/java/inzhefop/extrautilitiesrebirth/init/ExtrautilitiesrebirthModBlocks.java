
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import inzhefop.extrautilitiesrebirth.ExtrautilitiesrebirthMod;
import inzhefop.extrautilitiesrebirth.block.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtrautilitiesrebirthModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtrautilitiesrebirthMod.MODID);
	public static final RegistryObject<Block> ANGEL_BLOCK = REGISTRY.register("angel_block", () -> new AngelBlockBlock());
	public static final RegistryObject<Block> CHANDELIER = REGISTRY.register("chandelier", () -> new ChandelierBlock());
	public static final RegistryObject<Block> BEDROCK_BRICKS = REGISTRY.register("bedrock_bricks", () -> new BedrockBricksBlock());
	public static final RegistryObject<Block> BEDROCK_COBBLESTONE = REGISTRY.register("bedrock_cobblestone", () -> new BedrockCobblestoneBlock());
	public static final RegistryObject<Block> BEDROCK_SLABS = REGISTRY.register("bedrock_slabs", () -> new BedrockSlabsBlock());
	public static final RegistryObject<Block> BLOCK_OF_DEMON_METAL = REGISTRY.register("block_of_demon_metal", () -> new BlockOfDemonMetalBlock());
	public static final RegistryObject<Block> BLOCK_OF_ENCHANED_METAL = REGISTRY.register("block_of_enchaned_metal",
			() -> new BlockOfEnchanedMetalBlock());
	public static final RegistryObject<Block> BLOCK_OF_EVIL_INFUSED_IRON = REGISTRY.register("block_of_evil_infused_iron",
			() -> new BlockOfEvilInfusedIronBlock());
	public static final RegistryObject<Block> BORDER_STONE = REGISTRY.register("border_stone", () -> new BorderStoneBlock());
	public static final RegistryObject<Block> CHISLED_STONE_BRICKS = REGISTRY.register("chisled_stone_bricks", () -> new ChisledStoneBricksBlock());
	public static final RegistryObject<Block> EDGED_STONE_BRICKS = REGISTRY.register("edged_stone_bricks", () -> new EdgedStoneBricksBlock());
	public static final RegistryObject<Block> POLISHED_STONE = REGISTRY.register("polished_stone", () -> new PolishedStoneBlock());
	public static final RegistryObject<Block> QUARTZBURNT = REGISTRY.register("quartzburnt", () -> new QuartzburntBlock());
	public static final RegistryObject<Block> RAINBOW_STONE = REGISTRY.register("rainbow_stone", () -> new RainbowStoneBlock());
	public static final RegistryObject<Block> SANDY_GLASS = REGISTRY.register("sandy_glass", () -> new SandyGlassBlock());
	public static final RegistryObject<Block> STONEBURNT = REGISTRY.register("stoneburnt", () -> new StoneburntBlock());
	public static final RegistryObject<Block> CHUNK_LOADING_WAND = REGISTRY.register("chunk_loading_wand", () -> new ChunkLoadingWandBlock());
	public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = REGISTRY.register("compressed_cobblestone",
			() -> new CompressedCobblestoneBlock());
	public static final RegistryObject<Block> DOUBLE_COMPRESSED_COBBLESTONE = REGISTRY.register("double_compressed_cobblestone",
			() -> new DoubleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> TRIPLE_COMPRESSED_COBBLESTONE = REGISTRY.register("triple_compressed_cobblestone",
			() -> new TripleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> QUADRUPLE_COMPRESSED_COBBLESTONE = REGISTRY.register("quadruple_compressed_cobblestone",
			() -> new QuadrupleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> QUINTUPLE_COMPRESSED_COBBLESTONE = REGISTRY.register("quintuple_compressed_cobblestone",
			() -> new QuintupleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> SEXTUPLE_COMPRESSED_COBBLESTONE = REGISTRY.register("sextuple_compressed_cobblestone",
			() -> new SextupleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> SEPTUPLE_COMPRESSED_COBBLESTONE = REGISTRY.register("septuple_compressed_cobblestone",
			() -> new SeptupleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> OCTUPLE_COMPRESSED_COBBLESTONE = REGISTRY.register("octuple_compressed_cobblestone",
			() -> new OctupleCompressedCobblestoneBlock());
	public static final RegistryObject<Block> COMPRESSED_DIRT = REGISTRY.register("compressed_dirt", () -> new CompressedDirtBlock());
	public static final RegistryObject<Block> DOUBLE_COMPRESSED_DIRT = REGISTRY.register("double_compressed_dirt",
			() -> new DoubleCompressedDirtBlock());
	public static final RegistryObject<Block> TRIPLE_COMPRESSED_DIRT = REGISTRY.register("triple_compressed_dirt",
			() -> new TripleCompressedDirtBlock());
	public static final RegistryObject<Block> QUADRUPLE_COMPRESSED_DIRT = REGISTRY.register("quadruple_compressed_dirt",
			() -> new QuadrupleCompressedDirtBlock());
	public static final RegistryObject<Block> COMPRESSED_GRAVEL = REGISTRY.register("compressed_gravel", () -> new ComnpressedGravelBlock());
	public static final RegistryObject<Block> DOUBLE_COMPRESSED_GRAVEL = REGISTRY.register("double_compressed_gravel",
			() -> new DoubleCompressedGravelBlock());
	public static final RegistryObject<Block> COMPRESSED_SAND = REGISTRY.register("compressed_sand", () -> new CompressedSandBlock());
	public static final RegistryObject<Block> DOUBLE_COMPRESSED_SAND = REGISTRY.register("double_compressed_sand",
			() -> new DoubleCompressedSandBlock());
	public static final RegistryObject<Block> GOLD_CHEST = REGISTRY.register("gold_chest", () -> new GoldChestBlock());
	public static final RegistryObject<Block> CREATIVE_CHEST = REGISTRY.register("creative_chest", () -> new CreativeChestBlock());
	public static final RegistryObject<Block> CREATIVE_ENERGY_STORAGE = REGISTRY.register("creative_energy_storage",
			() -> new CreativeEnergyStorageBlock());
	public static final RegistryObject<Block> CREATIVE_HARVEST = REGISTRY.register("creative_harvest", () -> new CreativeHarvestBlock());
	public static final RegistryObject<Block> CURSED_EARTH = REGISTRY.register("cursed_earth", () -> new CursedEarthBlock());
	public static final RegistryObject<Block> ENDER_LILLY_ENDSTONE = REGISTRY.register("ender_lilly_endstone", () -> new EnderLillyEndstoneBlock());
	public static final RegistryObject<Block> ENDER_INFUSED_OBSIDIAN = REGISTRY.register("ender_infused_obsidian",
			() -> new EnderInfusedObsidianBlock());
	public static final RegistryObject<Block> ENDER_CORE = REGISTRY.register("ender_core", () -> new EnderCoreBlock());
	public static final RegistryObject<Block> DIAMOND_EDGED_COMPUTATIONAL_MATRIX = REGISTRY.register("diamond_edged_computational_matrix",
			() -> new DiamondEdgedComputationalMatrixBlock());
	public static final RegistryObject<Block> CREATIVE_SPIKES = REGISTRY.register("creative_spikes", () -> new CreativeSpikesBlock());
	public static final RegistryObject<Block> DIAMOND_SPIKE = REGISTRY.register("diamond_spike", () -> new DiamondSpikeBlock());
	public static final RegistryObject<Block> GOLD_SPIKE = REGISTRY.register("gold_spike", () -> new GoldSpikeBlock());
	public static final RegistryObject<Block> IRON_SPIKE = REGISTRY.register("iron_spike", () -> new IronSpikeBlock());
	public static final RegistryObject<Block> WOOD_SPIKE = REGISTRY.register("wood_spike", () -> new WoodSpikeBlock());
	public static final RegistryObject<Block> STONE_SPIKE = REGISTRY.register("stone_spike", () -> new StoneSpikeBlock());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_1 = REGISTRY.register("ender_lilly_stage_1", () -> new EnderLillyStage1Block());
	public static final RegistryObject<Block> LUNAR_PANEL = REGISTRY.register("lunar_panel", () -> new LunarPanelBlock());
	public static final RegistryObject<Block> SOLAR_PANEL = REGISTRY.register("solar_panel", () -> new SolarPanelBlock());
	public static final RegistryObject<Block> CREEPER_GLASS = REGISTRY.register("creeper_glass", () -> new CreeperGlassBlock());
	public static final RegistryObject<Block> DARK_ETHEREAL_GLASS = REGISTRY.register("dark_ethereal_glass", () -> new DarkEtherealGlassBlock());
	public static final RegistryObject<Block> DARK_GLASS = REGISTRY.register("dark_glass", () -> new DarkGlassBlock());
	public static final RegistryObject<Block> EDGED_GLASS = REGISTRY.register("edged_glass", () -> new EdgedGlassBlock());
	public static final RegistryObject<Block> ETHEREAL_GLASS = REGISTRY.register("ethereal_glass", () -> new EtherealGlassBlock());
	public static final RegistryObject<Block> CLEAN_GLASS = REGISTRY.register("clean_glass", () -> new CleanGlassBlock());
	public static final RegistryObject<Block> GLASS_BRICKS = REGISTRY.register("glass_bricks", () -> new GlassBricksBlock());
	public static final RegistryObject<Block> GLOWSTONE_GLASS = REGISTRY.register("glowstone_glass", () -> new GlowstoneGlassBlock());
	public static final RegistryObject<Block> GOLDEN_EDGED_GLASS = REGISTRY.register("golden_edged_glass", () -> new GoldenEdgedGlassBlock());
	public static final RegistryObject<Block> HEART_GLASS = REGISTRY.register("heart_glass", () -> new HeartGlassBlock());
	public static final RegistryObject<Block> INEFFABLE_GLASS = REGISTRY.register("ineffable_glass", () -> new IneffableGlassBlock());
	public static final RegistryObject<Block> INEFFABLE_INVERTED_GLASS = REGISTRY.register("ineffable_inverted_glass",
			() -> new IneffableInvertedGlassBlock());
	public static final RegistryObject<Block> OBSIDIAN_GLASS = REGISTRY.register("obsidian_glass", () -> new ObsidianGlassBlock());
	public static final RegistryObject<Block> REINFORCED_DARK_GLASS = REGISTRY.register("reinforced_dark_glass",
			() -> new ReinforcedDarkGlassBlock());
	public static final RegistryObject<Block> SQUARE_GLASS = REGISTRY.register("square_glass", () -> new SquareGlassBlock());
	public static final RegistryObject<Block> SWIRLING_GLASS = REGISTRY.register("swirling_glass", () -> new SwirlingGlassBlock());
	public static final RegistryObject<Block> CULINARY_GENERATOR = REGISTRY.register("culinary_generator", () -> new CulinaryGeneratorBlock());
	public static final RegistryObject<Block> DEATH_GENERATOR = REGISTRY.register("death_generator", () -> new DeathGeneratorBlock());
	public static final RegistryObject<Block> DISENCHANTMENT_GENERATOR = REGISTRY.register("disenchantment_generator",
			() -> new DisenchantmentGeneratorBlock());
	public static final RegistryObject<Block> ENDER_GENERATOR = REGISTRY.register("ender_generator", () -> new EnderGeneratorBlock());
	public static final RegistryObject<Block> TNT_GENERATOR = REGISTRY.register("tnt_generator", () -> new TNTGeneratorBlock());
	public static final RegistryObject<Block> FROSTY_GENERATOR_1 = REGISTRY.register("frosty_generator_1", () -> new FrostyGenerator1Block());
	public static final RegistryObject<Block> FURNACE_GENERATOR = REGISTRY.register("furnace_generator", () -> new FurnaceGeneratorBlock());
	public static final RegistryObject<Block> HALITOSIS_GENERATOR = REGISTRY.register("halitosis_generator", () -> new HalitosisGeneratorBlock());
	public static final RegistryObject<Block> NETHERSTAR_GENERATOR = REGISTRY.register("netherstar_generator", () -> new NetherstarGeneratorBlock());
	public static final RegistryObject<Block> OVERCLOCKED_GENERATOR = REGISTRY.register("overclocked_generator",
			() -> new OverclockedGeneratorBlock());
	public static final RegistryObject<Block> PINK_GENERATOR = REGISTRY.register("pink_generator", () -> new PinkGeneratorBlock());
	public static final RegistryObject<Block> POTION_GENERATOR_1 = REGISTRY.register("potion_generator_1", () -> new PotionGenerator1Block());
	public static final RegistryObject<Block> SLIMEY_GENERATOR = REGISTRY.register("slimey_generator", () -> new SlimeyGeneratorBlock());
	public static final RegistryObject<Block> SURVIVAL_GENERATOR = REGISTRY.register("survival_generator", () -> new SurvivalGeneratorBlock());
	public static final RegistryObject<Block> REDSTONE_GENERATOR = REGISTRY.register("redstone_generator", () -> new RedstoneGeneratorBlock());
	public static final RegistryObject<Block> MAGMA_GENERATOR = REGISTRY.register("magma_generator", () -> new MagmaGeneratorBlock());
	public static final RegistryObject<Block> MAGICAL_PLANKS = REGISTRY.register("magical_planks", () -> new MagicalPlanksBlock());
	public static final RegistryObject<Block> MAGICAL_WOOD = REGISTRY.register("magical_wood", () -> new MagicalWoodBlock());
	public static final RegistryObject<Block> RAINMBOW_GENERATOR_TOP = REGISTRY.register("rainmbow_generator_top",
			() -> new RainmbowGeneratorTopBlock());
	public static final RegistryObject<Block> RAINBOW_GENERATOR_BOTTOM = REGISTRY.register("rainbow_generator_bottom",
			() -> new RainbowGeneratorBottomBlock());
	public static final RegistryObject<Block> RAINBOW_GENERATOR = REGISTRY.register("rainbow_generator", () -> new RainbowGeneratorBlock());
	public static final RegistryObject<Block> ENDER_QUARRY = REGISTRY.register("ender_quarry", () -> new EnderQuarryBlock());
	public static final RegistryObject<Block> ENDER_THERMIC_PUMP = REGISTRY.register("ender_thermic_pump", () -> new EnderThermicPumpBlock());
	public static final RegistryObject<Block> REDSTONE_CLOCK = REGISTRY.register("redstone_clock", () -> new RedstoneClockBlock());
	public static final RegistryObject<Block> CREATIVE_DRUM = REGISTRY.register("creative_drum", () -> new CreativeDrumBlock());
	public static final RegistryObject<Block> BEDROCK_DRUM = REGISTRY.register("bedrock_drum", () -> new BedrockDrumBlock());
	public static final RegistryObject<Block> REINFORCED_DRUM = REGISTRY.register("reinforced_drum", () -> new ReinforcedDrumBlock());
	public static final RegistryObject<Block> IRON_DRUM = REGISTRY.register("iron_drum", () -> new IronDrumBlock());
	public static final RegistryObject<Block> STONE_DRUM = REGISTRY.register("stone_drum", () -> new StoneDrumBlock());
	public static final RegistryObject<Block> MECHANICAL_MINER = REGISTRY.register("mechanical_miner", () -> new MechanicalMinerBlock());
	public static final RegistryObject<Block> MECHANICAL_USER = REGISTRY.register("mechanical_user", () -> new MechanicalUserBlock());
	public static final RegistryObject<Block> FURNACE = REGISTRY.register("furnace", () -> new FurnaceBlock());
	public static final RegistryObject<Block> SORTING_MACHINE = REGISTRY.register("sorting_machine", () -> new SortingMachineBlock());
	public static final RegistryObject<Block> ENCHANTER = REGISTRY.register("enchanter", () -> new EnchanterBlock());
	public static final RegistryObject<Block> RESONATOR = REGISTRY.register("resonator", () -> new ResonatorBlock());
	public static final RegistryObject<Block> WIRELESS_FE_BATTERY = REGISTRY.register("wireless_fe_battery", () -> new WirelessFEBatteryBlock());
	public static final RegistryObject<Block> ENDER_QUARRY_UPGRADE_BASE = REGISTRY.register("ender_quarry_upgrade_base",
			() -> new EnderQuarryUpgradeBaseBlock());
	public static final RegistryObject<Block> ENDER_QUARRY_SILK_TOUCH_UPGRADE = REGISTRY.register("ender_quarry_silk_touch_upgrade",
			() -> new EnderQuarrySilkTouchUpgradeBlock());
	public static final RegistryObject<Block> ENDER_QUARRY_WORLD_HOLE_UPGRADE = REGISTRY.register("ender_quarry_world_hole_upgrade",
			() -> new EnderQuarryWorldHoleUpgradeBlock());
	public static final RegistryObject<Block> ENDER_QUARRY_SILK_TOUCH_UPGRADE_3 = REGISTRY.register("ender_quarry_silk_touch_upgrade_3",
			() -> new EnderQuarrySilkTouchUpgrade3Block());
	public static final RegistryObject<Block> ENDER_QUARRY_SPEED_UPGRADE = REGISTRY.register("ender_quarry_speed_upgrade",
			() -> new EnderQuarrySpeedUpgradeBlock());
	public static final RegistryObject<Block> ENDER_QUARRY_SILK_TOUCH_UPGRADE_2 = REGISTRY.register("ender_quarry_silk_touch_upgrade_2",
			() -> new EnderQuarrySilkTouchUpgrade2Block());
	public static final RegistryObject<Block> TRASH_CAN = REGISTRY.register("trash_can", () -> new TrashCanBlock());
	public static final RegistryObject<Block> TRASH_CAN_ENERGY = REGISTRY.register("trash_can_energy", () -> new TrashCanEnergyBlock());
	public static final RegistryObject<Block> TRASH_CAN_FLUID = REGISTRY.register("trash_can_fluid", () -> new TrashCanFluidBlock());
	public static final RegistryObject<Block> ENDER_MARKER = REGISTRY.register("ender_marker", () -> new EnderMarkerBlock());
	public static final RegistryObject<Block> OVERWORLD_PORTAL = REGISTRY.register("overworld_portal", () -> new OverworldPortalBlock());
	public static final RegistryObject<Block> MACHINE_BLOCK = REGISTRY.register("machine_block", () -> new MachineBlockBlock());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_2 = REGISTRY.register("ender_lilly_stage_2", () -> new EnderLillyStage2Block());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_3 = REGISTRY.register("ender_lilly_stage_3", () -> new EnderLillyStage3Block());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_4 = REGISTRY.register("ender_lilly_stage_4", () -> new EnderLillyStage4Block());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_5 = REGISTRY.register("ender_lilly_stage_5", () -> new EnderLillyStage5Block());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_6 = REGISTRY.register("ender_lilly_stage_6", () -> new EnderLillyStage6Block());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_7 = REGISTRY.register("ender_lilly_stage_7", () -> new EnderLillyStage7Block());
	public static final RegistryObject<Block> ENDER_LILLY_STAGE_8 = REGISTRY.register("ender_lilly_stage_8", () -> new EnderLillyStage8Block());
	public static final RegistryObject<Block> FERROUS_JUNIPER_LOG = REGISTRY.register("ferrous_juniper_log", () -> new FerrousJuniperLogBlock());
	public static final RegistryObject<Block> FERROUS_JUNIPER_PLANKS = REGISTRY.register("ferrous_juniper_planks",
			() -> new FerrousJuniperPlanksBlock());
	public static final RegistryObject<Block> REDSTONE_CLOCK_OFF = REGISTRY.register("redstone_clock_off", () -> new RedstoneClockOffBlock());
	public static final RegistryObject<Block> CREATIVE_INV_SAMPLE = REGISTRY.register("creative_inv_sample", () -> new CreativeInvSampleBlock());
	public static final RegistryObject<Block> INVENTORY_INTERFACE = REGISTRY.register("inventory_interface", () -> new InventoryInterfaceBlock());
	public static final RegistryObject<Block> FE_TRANSMITTER = REGISTRY.register("fe_transmitter", () -> new FeTransmitterBlock());
	public static final RegistryObject<Block> QUANTUM_QUARRY = REGISTRY.register("quantum_quarry", () -> new QuantumQuarryBlock());
	public static final RegistryObject<Block> QUANTUM_QUARRY_ACTUATOR = REGISTRY.register("quantum_quarry_actuator",
			() -> new QuantumQuarryActuatorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {

			ExtrautilitiesrebirthModBlocks.REGISTRY.getEntries().stream()
					.filter(entry -> (entry.get() instanceof ModAbstractGlassBlock))
					.forEach(blockRegistryObject -> {
						ModAbstractGlassBlock glassBlock = (ModAbstractGlassBlock) blockRegistryObject.get();
						ItemBlockRenderTypes.setRenderLayer(glassBlock, renderType -> renderType == RenderType.translucent());
					});
//			ItemBlockRenderTypes.setRenderLayer(SANDY_GLASS.get(), renderType -> renderType == RenderType.cutout());

			ChandelierBlock.registerRenderLayer();
			ChunkLoadingWandBlock.registerRenderLayer();
			GoldChestBlock.registerRenderLayer();
			CreativeChestBlock.registerRenderLayer();
			CreativeSpikesBlock.registerRenderLayer();
			DiamondSpikeBlock.registerRenderLayer();
			GoldSpikeBlock.registerRenderLayer();
			IronSpikeBlock.registerRenderLayer();
			WoodSpikeBlock.registerRenderLayer();
			StoneSpikeBlock.registerRenderLayer();
			EnderLillyStage1Block.registerRenderLayer();
			LunarPanelBlock.registerRenderLayer();
			SolarPanelBlock.registerRenderLayer();
			CreativeDrumBlock.registerRenderLayer();
			BedrockDrumBlock.registerRenderLayer();
			ReinforcedDrumBlock.registerRenderLayer();
			IronDrumBlock.registerRenderLayer();
			StoneDrumBlock.registerRenderLayer();
			ResonatorBlock.registerRenderLayer();
			EnderQuarryUpgradeBaseBlock.registerRenderLayer();
			EnderQuarrySilkTouchUpgradeBlock.registerRenderLayer();
			EnderQuarryWorldHoleUpgradeBlock.registerRenderLayer();
			EnderQuarrySilkTouchUpgrade3Block.registerRenderLayer();
			EnderQuarrySpeedUpgradeBlock.registerRenderLayer();
			EnderQuarrySilkTouchUpgrade2Block.registerRenderLayer();
			TrashCanBlock.registerRenderLayer();
			TrashCanEnergyBlock.registerRenderLayer();
			TrashCanFluidBlock.registerRenderLayer();
			EnderMarkerBlock.registerRenderLayer();
			EnderLillyStage2Block.registerRenderLayer();
			EnderLillyStage3Block.registerRenderLayer();
			EnderLillyStage4Block.registerRenderLayer();
			EnderLillyStage5Block.registerRenderLayer();
			EnderLillyStage6Block.registerRenderLayer();
			EnderLillyStage7Block.registerRenderLayer();
			EnderLillyStage8Block.registerRenderLayer();
			FeTransmitterBlock.registerRenderLayer();
		}
	}
}
