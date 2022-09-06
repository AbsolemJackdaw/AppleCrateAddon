package jackdaw.applecrates;

import jackdaw.applecrates.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(FruitCrates.MODID)
public class FruitCrates {
    public static final String MODID = "applecrates_fruit";

    public FruitCrates() {
        LocalCompat.INSTANCE.init();
    }
}
