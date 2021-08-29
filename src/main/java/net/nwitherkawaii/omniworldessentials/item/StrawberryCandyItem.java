
package net.nwitherkawaii.omniworldessentials.item;

import net.nwitherkawaii.omniworldessentials.procedures.StrawberryCandyEatenProcedure;
import net.nwitherkawaii.omniworldessentials.itemgroup.OmniworldEssentialsItemGroup;
import net.nwitherkawaii.omniworldessentials.OmniworldessentialsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

@OmniworldessentialsModElements.ModElement.Tag
public class StrawberryCandyItem extends OmniworldessentialsModElements.ModElement {
	@ObjectHolder("omniworldessentials:strawberry_candy")
	public static final Item block = null;
	public StrawberryCandyItem(OmniworldessentialsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(OmniworldEssentialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("strawberry_candy");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				StrawberryCandyEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
