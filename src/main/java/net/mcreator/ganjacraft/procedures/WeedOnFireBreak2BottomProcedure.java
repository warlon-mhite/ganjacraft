package net.mcreator.ganjacraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;

@GanjacraftModElements.ModElement.Tag
public class WeedOnFireBreak2BottomProcedure extends GanjacraftModElements.ModElement {
	public WeedOnFireBreak2BottomProcedure(GanjacraftModElements instance) {
		super(instance, 209);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency x for procedure WeedOnFireBreak2Bottom!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency y for procedure WeedOnFireBreak2Bottom!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency z for procedure WeedOnFireBreak2Bottom!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency world for procedure WeedOnFireBreak2Bottom!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.FIRE.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SOUL_FIRE.getDefaultState()
						.getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) z), false);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) z), false);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
		}
	}
}
