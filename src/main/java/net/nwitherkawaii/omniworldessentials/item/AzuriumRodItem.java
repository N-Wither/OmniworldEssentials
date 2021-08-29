
package net.nwitherkawaii.omniworldessentials.item;

import net.nwitherkawaii.omniworldessentials.itemgroup.OmniworldEssentialsItemGroup;
import net.nwitherkawaii.omniworldessentials.OmniworldessentialsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@OmniworldessentialsModElements.ModElement.Tag
public class AzuriumRodItem extends OmniworldessentialsModElements.ModElement {
	@ObjectHolder("omniworldessentials:azurium_rod")
	public static final Item block = null;
	public AzuriumRodItem(OmniworldessentialsModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OmniworldEssentialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("azurium_rod");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
