
package net.nwitherkawaii.omniworldessentials.item;

import net.nwitherkawaii.omniworldessentials.itemgroup.OmniworldEssentialsItemGroup;
import net.nwitherkawaii.omniworldessentials.OmniworldessentialsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@OmniworldessentialsModElements.ModElement.Tag
public class CreativeSwordItem extends OmniworldessentialsModElements.ModElement {
	@ObjectHolder("omniworldessentials:creative_sword")
	public static final Item block = null;
	public CreativeSwordItem(OmniworldessentialsModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 2147483645f;
			}

			public int getHarvestLevel() {
				return 127;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 12f, new Item.Properties().group(OmniworldEssentialsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("creative_sword"));
	}
}
