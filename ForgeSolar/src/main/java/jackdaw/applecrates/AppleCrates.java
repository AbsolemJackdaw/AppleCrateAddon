package jackdaw.applecrates;

import jackdaw.applecrates.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(AppleCrates.MODID)
public class AppleCrates {
    public static final String MODID = "applecrates_solarforge";

    public AppleCrates() {
        LocalCompat.INSTANCE.init();
    }
}
