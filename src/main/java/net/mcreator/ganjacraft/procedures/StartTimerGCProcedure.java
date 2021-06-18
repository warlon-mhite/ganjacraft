package net.mcreator.ganjacraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;

@GanjacraftModElements.ModElement.Tag
public class StartTimerGCProcedure extends GanjacraftModElements.ModElement {
	public StartTimerGCProcedure(GanjacraftModElements instance) {
		super(instance, 86);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency entity for procedure StartTimerGC!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("StartTimerGC", (true));
		entity.getPersistentData().putDouble("TimerGC", 0);
	}
}
