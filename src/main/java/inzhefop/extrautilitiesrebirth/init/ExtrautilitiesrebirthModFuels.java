
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class ExtrautilitiesrebirthModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == ExtrautilitiesrebirthModItems.RED_COAL.get())
			event.setBurnTime(11200);
		else if (itemstack.getItem() == ExtrautilitiesrebirthModBlocks.MAGICAL_PLANKS.get().asItem())
			event.setBurnTime(3200);
	}
}
