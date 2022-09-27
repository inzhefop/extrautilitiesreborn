
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class GoldenFeatherItem extends Item {
	public GoldenFeatherItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
