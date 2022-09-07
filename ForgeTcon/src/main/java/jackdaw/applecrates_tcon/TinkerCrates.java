package jackdaw.applecrates_tcon;

import jackdaw.applecrates_tcon.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(TinkerCrates.MODID)
public class TinkerCrates {
    public static final String MODID = "applecrates_tcon";

    public TinkerCrates() {
        LocalCompat.INSTANCE.init();
    }
}
