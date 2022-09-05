package jackdaw.applecrates_byg;

import jackdaw.applecrates_byg.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(BygCrates.MODID)
public class BygCrates {
    public static final String MODID = "applecrates_byg";

    public BygCrates() {
        LocalCompat.INSTANCE.init();
    }
}
