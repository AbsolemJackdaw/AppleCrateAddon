package jackdaw.applecrates_deeperdarker;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.fabricmc.api.ModInitializer;

public class DarkerCrates implements ModInitializer {

    public static final String MODID = "applecrates_deeperdarker";

    @Override
    public void onInitialize() {

        String[] names = new String[]{"echo", "bloom"};
        String deeperdarker = "deeperdarker";
        for (String wood : names)
            new AppleCrateAPI.AppleCrateBuilder(deeperdarker, MODID, wood).register();

        GeneralRegistry.prepareForRegistry(MODID);
    }
}