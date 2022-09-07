package jackdaw.applecrates_malum;

import jackdaw.applecrates_malum.compat.LocalCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(MalumCrates.MODID)
public class MalumCrates {
    public static final String MODID = "applecrates_malum";

    public MalumCrates() {
        LocalCompat.INSTANCE.init();
    }
}
