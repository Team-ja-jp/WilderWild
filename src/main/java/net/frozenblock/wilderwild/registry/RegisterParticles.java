package net.frozenblock.wilderwild.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.frozenblock.wilderwild.WilderWild;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterParticles {
    public static final DefaultParticleType POLLEN = FabricParticleTypes.simple();
    public static final DefaultParticleType ECHOING_BUBBLE = FabricParticleTypes.simple();
    public static final DefaultParticleType ECHOING_BUBBLE_DOWNWARDS = FabricParticleTypes.simple();
    public static final DefaultParticleType BIG_ECHOING_BUBBLE = FabricParticleTypes.simple();
    public static final DefaultParticleType BIG_ECHOING_BUBBLE_DOWNWARDS = FabricParticleTypes.simple();

    public static void RegisterParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WilderWild.MOD_ID, "pollen"), POLLEN);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WilderWild.MOD_ID, "echoing_bubble"), ECHOING_BUBBLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WilderWild.MOD_ID, "echoing_bubble_downward"), ECHOING_BUBBLE_DOWNWARDS);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WilderWild.MOD_ID, "big_echoing_bubble"), BIG_ECHOING_BUBBLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WilderWild.MOD_ID, "big_echoing_bubble_downward"), BIG_ECHOING_BUBBLE_DOWNWARDS);
    }
}
