package net.frozenblock.wilderwild.mixin.server;

import net.frozenblock.wilderwild.registry.RegisterSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.phys.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Snowball.class)
public class SnowballMixin {

    @Inject(method = "onHit", at = @At("HEAD"))
	public void onHit(HitResult result, CallbackInfo info) {
		Snowball snowball = Snowball.class.cast(this);
		snowball.level.playSound(null, snowball.getX(), snowball.getY(), snowball.getZ(), RegisterSounds.ITEM_SNOWBALL_LAND, SoundSource.BLOCKS, 0.4F, 0.85F + (snowball.level.random.nextFloat() * 0.2F));
	}
}
