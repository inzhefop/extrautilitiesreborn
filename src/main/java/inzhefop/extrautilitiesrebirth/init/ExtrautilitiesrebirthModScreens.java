
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import inzhefop.extrautilitiesrebirth.client.gui.TrashCanGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.SorterGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.ResonantorGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.NormalGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.MechanicalUserGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.MechanicalMinerGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.GoldenChestGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.GoldenBagGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.FurnaceGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.EnderQuarryGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.EnchanterGUIScreen;
import inzhefop.extrautilitiesrebirth.client.gui.CreativeChestGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExtrautilitiesrebirthModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ExtrautilitiesrebirthModMenus.CREATIVE_CHEST_GUI, CreativeChestGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.NORMAL_GUI, NormalGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.MECHANICAL_MINER_GUI, MechanicalMinerGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.MECHANICAL_USER_GUI, MechanicalUserGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.RESONANTOR_GUI, ResonantorGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.FURNACE_GUI, FurnaceGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.ENCHANTER_GUI, EnchanterGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.TRASH_CAN_GUI, TrashCanGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.GOLDEN_BAG_GUI, GoldenBagGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.GOLDEN_CHEST_GUI, GoldenChestGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.ENDER_QUARRY_GUI, EnderQuarryGUIScreen::new);
			MenuScreens.register(ExtrautilitiesrebirthModMenus.SORTER_GUI, SorterGUIScreen::new);
		});
	}
}
