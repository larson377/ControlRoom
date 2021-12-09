package net.mcreator.controlroom.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;

import net.mcreator.controlroom.ControlRoomMod;

import java.util.Map;

public class RecieverredstoneProcedure {
	public static double executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency x for procedure Recieverredstone!");
			return 0;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency y for procedure Recieverredstone!");
			return 0;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency z for procedure Recieverredstone!");
			return 0;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency world for procedure Recieverredstone!");
			return 0;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return (new Object() {
			public double getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "signal_strength"));
	}
}
