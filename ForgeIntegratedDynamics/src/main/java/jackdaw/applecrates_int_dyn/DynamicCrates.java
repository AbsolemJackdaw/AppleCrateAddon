package jackdaw.applecrates_int_dyn;

import jackdaw.applecrates_int_dyn.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(DynamicCrates.MODID)
public class DynamicCrates {
    public static final String MODID = "applecrates_intdyn";

    public DynamicCrates() {
        LocalCompat.INSTANCE.init();
    }
}
