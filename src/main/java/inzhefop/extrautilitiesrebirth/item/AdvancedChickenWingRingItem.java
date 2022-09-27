
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class AdvancedChickenWingRingItem extends Item {
	public AdvancedChickenWingRingItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).durability(256).rarity(Rarity.UNCOMMON));
	}
}
