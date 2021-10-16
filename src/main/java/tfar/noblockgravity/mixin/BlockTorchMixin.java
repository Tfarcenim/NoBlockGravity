package tfar.noblockgravity.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockTorch.class)
public class BlockTorchMixin {
	@Inject(at = @At("HEAD"), method = "onNeighborChangeInternal",cancellable = true)
	private void init(World worldIn, BlockPos pos, IBlockState state, CallbackInfoReturnable<Boolean> cir) {
		Block block = (Block)(Object)this;
		cir.setReturnValue(false);
	}

	@Inject(at = @At("HEAD"), method = "checkForDrop",cancellable = true)
	private void init1(World worldIn, BlockPos pos, IBlockState state, CallbackInfoReturnable<Boolean> cir) {
		Block block = (Block)(Object)this;
		cir.setReturnValue(true);
	}
}
