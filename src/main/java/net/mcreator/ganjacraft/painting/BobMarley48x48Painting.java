
package net.mcreator.ganjacraft.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class BobMarley48x48Painting extends GanjacraftModElements.ModElement {
	public BobMarley48x48Painting(GanjacraftModElements instance) {
		super(instance, 112);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(48, 48).setRegistryName("bob_marley_48x_48"));
	}
}
