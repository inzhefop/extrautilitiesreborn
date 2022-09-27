
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import inzhefop.extrautilitiesrebirth.ExtrautilitiesrebirthMod;

public class ExtrautilitiesrebirthModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			ExtrautilitiesrebirthMod.MODID);
	public static final RegistryObject<ParticleType<?>> RAINBOW_PARTICLE = REGISTRY.register("rainbow_particle", () -> new SimpleParticleType(false));
}
