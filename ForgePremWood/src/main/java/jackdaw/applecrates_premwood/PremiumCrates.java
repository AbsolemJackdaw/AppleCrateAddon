package jackdaw.applecrates_premwood;

import jackdaw.applecrates_premwood.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(PremiumCrates.MODID)
public class PremiumCrates {
    public static final String MODID = "applecrates_premwood";

    public PremiumCrates() {
        LocalCompat.INSTANCE.init();
    }
}
