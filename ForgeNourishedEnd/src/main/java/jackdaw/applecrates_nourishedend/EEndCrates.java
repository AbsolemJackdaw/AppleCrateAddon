package jackdaw.applecrates_nourishedend;

import jackdaw.applecrates_nourishedend.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(EEndCrates.MODID)
public class EEndCrates {
    public static final String MODID = "applecrates_nourishedend";

    public EEndCrates() {
        LocalCompat.INSTANCE.init();
    }
}
