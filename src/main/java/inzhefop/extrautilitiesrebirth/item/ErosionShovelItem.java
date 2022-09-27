
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;

public class ErosionShovelItem extends ShovelItem {
	public ErosionShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 6244;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ExtrautilitiesrebirthModItems.UNSTABLE_INGOT.get()));
			}
		}, 1, 1f, new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).fireResistant());
	}
}
