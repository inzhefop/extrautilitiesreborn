package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.api.distmarker.Dist;

import javax.annotation.Nullable;

import inzhefop.extrautilitiesrebirth.ExtrautilitiesrebirthMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.DEDICATED_SERVER})
public class OnGameStartProcedure {
	@SubscribeEvent
	public static void init(FMLDedicatedServerSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		ExtrautilitiesrebirthMod.LOGGER.info("Extra Utilities Reborn successfully loaded!");
	}
}
