package net.mcreator.controlroom.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.WorldEvent;

import net.minecraft.world.IWorld;

import java.util.Map;
import java.util.HashMap;

import java.io.File;

public class CreateControlLeverJsonProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onWorldLoad(WorldEvent.Load event) {
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		File file = new File("");
		file = new File(((FMLPaths.GAMEDIR.get().toString()) + "" + ("nice")), File.separator + "neat.json");
		file.mkdirs();
	}
}
