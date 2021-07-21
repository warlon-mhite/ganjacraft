
package net.mcreator.ganjacraft.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class SmokingLadyVintage32x48Painting extends GanjacraftModElements.ModElement {
	public SmokingLadyVintage32x48Painting(GanjacraftModElements instance) {
		super(instance, 116);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 48).setRegistryName("smoking_lady_vintage_32x_48"));
	}
}
