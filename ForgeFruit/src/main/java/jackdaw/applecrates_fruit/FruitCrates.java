package jackdaw.applecrates_fruit;

import jackdaw.applecrates_fruit.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(FruitCrates.MODID)
public class FruitCrates {
    public static final String MODID = "applecrates_fruit";

    public FruitCrates() {
        LocalCompat.INSTANCE.init();
    }
}
