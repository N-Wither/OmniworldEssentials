package net.nwitherkawaii.omniworldessentials.procedures;

import net.nwitherkawaii.omniworldessentials.OmniworldessentialsMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class StrawberryCandyEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OmniworldessentialsMod.LOGGER.warn("Failed to load dependency entity for procedure StrawberryCandyEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 200, (int) 0));
	}
}
