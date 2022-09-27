
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import inzhefop.extrautilitiesrebirth.world.inventory.TrashCanGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.ResonantorGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.NormalGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.MechanicalUserGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.MechanicalMinerGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.GoldenChestGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.GoldenBagGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.FurnaceGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.EnderQuarryGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.EnchanterGUIMenu;
import inzhefop.extrautilitiesrebirth.world.inventory.CreativeChestGUIMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtrautilitiesrebirthModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CreativeChestGUIMenu> CREATIVE_CHEST_GUI = register("creative_chest_gui",
			(id, inv, extraData) -> new CreativeChestGUIMenu(id, inv, extraData));
	public static final MenuType<NormalGUIMenu> NORMAL_GUI = register("normal_gui", (id, inv, extraData) -> new NormalGUIMenu(id, inv, extraData));
	public static final MenuType<MechanicalMinerGUIMenu> MECHANICAL_MINER_GUI = register("mechanical_miner_gui",
			(id, inv, extraData) -> new MechanicalMinerGUIMenu(id, inv, extraData));
	public static final MenuType<MechanicalUserGUIMenu> MECHANICAL_USER_GUI = register("mechanical_user_gui",
			(id, inv, extraData) -> new MechanicalUserGUIMenu(id, inv, extraData));
	public static final MenuType<ResonantorGUIMenu> RESONANTOR_GUI = register("resonantor_gui",
			(id, inv, extraData) -> new ResonantorGUIMenu(id, inv, extraData));
	public static final MenuType<FurnaceGUIMenu> FURNACE_GUI = register("furnace_gui",
			(id, inv, extraData) -> new FurnaceGUIMenu(id, inv, extraData));
	public static final MenuType<EnchanterGUIMenu> ENCHANTER_GUI = register("enchanter_gui",
			(id, inv, extraData) -> new EnchanterGUIMenu(id, inv, extraData));
	public static final MenuType<TrashCanGUIMenu> TRASH_CAN_GUI = register("trash_can_gui",
			(id, inv, extraData) -> new TrashCanGUIMenu(id, inv, extraData));
	public static final MenuType<GoldenBagGUIMenu> GOLDEN_BAG_GUI = register("golden_bag_gui",
			(id, inv, extraData) -> new GoldenBagGUIMenu(id, inv, extraData));
	public static final MenuType<GoldenChestGUIMenu> GOLDEN_CHEST_GUI = register("golden_chest_gui",
			(id, inv, extraData) -> new GoldenChestGUIMenu(id, inv, extraData));
	public static final MenuType<EnderQuarryGUIMenu> ENDER_QUARRY_GUI = register("ender_quarry_gui",
			(id, inv, extraData) -> new EnderQuarryGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
