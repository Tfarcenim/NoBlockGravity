package tfar.noblockgravity.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockMushroom.class)
public class BlockMushroomMixin {
	@Inject(at = @At("HEAD"), method = "canBlockStay",cancellable = true)
	private void init(World worldIn, BlockPos pos, IBlockState state, CallbackInfoReturnable<Boolean> cir) {
		Block block = (Block)(Object)this;
		cir.setReturnValue(true);
	}
}
