package net.mcreator.ganjacraft.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;
import java.util.Iterator;

@GanjacraftModElements.ModElement.Tag
public class HempFiberCraftedAdvancementProcedure extends GanjacraftModElements.ModElement {
	public HempFiberCraftedAdvancementProcedure(GanjacraftModElements instance) {
		super(instance, 66);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency entity for procedure HempFiberCraftedAdvancement!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof ServerPlayerEntity) {
			Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
					.getAdvancement(new ResourceLocation("ganjacraft:hemptextilachivements"));
			AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemaningCriteria().iterator();
				while (_iterator.hasNext()) {
					String _criterion = (String) _iterator.next();
					((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
				}
			}
		}
	}
}
