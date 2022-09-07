package jackdaw.applecrates;

import jackdaw.applecrates.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(SolarCrates.MODID)
public class SolarCrates {
    public static final String MODID = "applecrates_solarforge";

    public SolarCrates() {
        LocalCompat.INSTANCE.init();
    }
}
