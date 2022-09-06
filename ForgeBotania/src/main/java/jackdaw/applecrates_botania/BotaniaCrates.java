package jackdaw.applecrates_botania;

import jackdaw.applecrates_botania.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(BotaniaCrates.MODID)
public class BotaniaCrates {
    public static final String MODID = "applecrates_botania";

    public BotaniaCrates() {
        LocalCompat.INSTANCE.init();
    }
}
