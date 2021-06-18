package net.mcreator.ganjacraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;

@GanjacraftModElements.ModElement.Tag
public class StartTimerGAProcedure extends GanjacraftModElements.ModElement {
	public StartTimerGAProcedure(GanjacraftModElements instance) {
		super(instance, 85);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency entity for procedure StartTimerGA!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("StartTimerGA", (true));
		entity.getPersistentData().putDouble("TimerGA", 0);
	}
}
