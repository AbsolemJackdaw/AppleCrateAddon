package jackdaw.applecrates_forbarc;

import jackdaw.applecrates_forbarc.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(ArcanusCrates.MODID)
public class ArcanusCrates {
    public static final String MODID = "applecrates_forbarc";

    public ArcanusCrates() {
        LocalCompat.INSTANCE.init();
    }
}
