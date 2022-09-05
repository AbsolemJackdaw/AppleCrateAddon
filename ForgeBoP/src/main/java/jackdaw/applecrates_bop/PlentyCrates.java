package jackdaw.applecrates_bop;

import jackdaw.applecrates_bop.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(PlentyCrates.MODID)
public class PlentyCrates {
    public static final String MODID = "applecrates_bop";

    public PlentyCrates() {
        LocalCompat.INSTANCE.init();
    }
}
