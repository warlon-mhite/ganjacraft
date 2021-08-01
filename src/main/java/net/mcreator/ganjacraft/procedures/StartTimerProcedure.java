package net.mcreator.ganjacraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;

@GanjacraftModElements.ModElement.Tag
public class StartTimerProcedure extends GanjacraftModElements.ModElement {
	public StartTimerProcedure(GanjacraftModElements instance) {
		super(instance, 100);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency entity for procedure StartTimer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("StartTimer", (true));
		entity.getPersistentData().putDouble("Timer", 0);
	}
}
