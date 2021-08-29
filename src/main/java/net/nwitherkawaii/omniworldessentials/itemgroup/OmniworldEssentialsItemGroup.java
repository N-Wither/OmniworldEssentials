
package net.nwitherkawaii.omniworldessentials.itemgroup;

import net.nwitherkawaii.omniworldessentials.item.AzuriumIngotItem;
import net.nwitherkawaii.omniworldessentials.OmniworldessentialsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@OmniworldessentialsModElements.ModElement.Tag
public class OmniworldEssentialsItemGroup extends OmniworldessentialsModElements.ModElement {
	public OmniworldEssentialsItemGroup(OmniworldessentialsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabomniworld_essentials") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AzuriumIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
