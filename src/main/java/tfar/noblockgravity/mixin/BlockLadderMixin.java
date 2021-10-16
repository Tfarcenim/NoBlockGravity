package tfar.noblockgravity.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockLadder.class)
public class BlockLadderMixin {
	@Inject(at = @At("HEAD"), method = "neighborChanged",cancellable = true)
	private void init(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, CallbackInfo ci) {
		ci.cancel();
	}
}
