
package net.mcreator.ganjacraft.item;

@GanjacraftModElements.ModElement.Tag
public class CookedSeedsItem extends GanjacraftModElements.ModElement {

	@ObjectHolder("ganjacraft:cooked_seeds")
	public static final Item block = null;

	public CookedSeedsItem(GanjacraftModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("cooked_seeds");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
