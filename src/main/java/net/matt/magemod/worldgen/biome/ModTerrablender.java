package net.matt.magemod.worldgen.biome;

import net.matt.magemod.MageMod;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(MageMod.MOD_ID, "overworld"), 5));
    }
}