package top.catowncraft.cherrywire.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Environment(EnvType.CLIENT)
@Mixin(RedStoneWireBlock.class)
public class RedStoneWireBlockMixin {
    @Shadow
    @Final
    private static Vec3[] COLORS;

    static {
        double[] test$r = {0.44, 0.78, 0.84, 0.90, 0.94, 0.98, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00};
        double[] test$g = {0.07, 0.16, 0.24, 0.27, 0.31, 0.33, 0.37, 0.39, 0.43, 0.47, 0.53, 0.55, 0.59, 0.63, 0.63, 0.65};
        double[] test$b = {0.14, 0.27, 0.37, 0.41, 0.47, 0.49, 0.53, 0.53, 0.55, 0.59, 0.63, 0.65, 0.67, 0.69, 0.71, 0.71};

        for (int i = 0; i < 16; i++) {
            COLORS[i] = new Vec3(test$r[i], test$g[i], test$b[i]);
        }
    }
}
