package tfar.noblockgravity.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockFalling.class)
public class BlockFallingMixin {
	@Inject(at = @At("HEAD"), method = "checkFallable",cancellable = true)
	private void init(CallbackInfo info) {
		Block block = (Block)(Object)this;
		info.cancel();//do we need to whitelist blocks?
	}
}
