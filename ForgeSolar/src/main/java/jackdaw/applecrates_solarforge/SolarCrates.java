package jackdaw.applecrates_solarforge;

import jackdaw.applecrates_solarforge.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(SolarCrates.MODID)
public class SolarCrates {
    public static final String MODID = "applecrates_solarforge";

    public SolarCrates() {
        LocalCompat.INSTANCE.init();
    }
}
