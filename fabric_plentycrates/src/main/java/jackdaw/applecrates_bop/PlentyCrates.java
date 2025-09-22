package jackdaw.applecrates_bop;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.fabricmc.api.ModInitializer;

public class PlentyCrates implements ModInitializer {

    public static final String MODID = "applecrates_bop";

    @Override
    public void onInitialize() {

        String[] names = new String[]{"dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow"};
        String biomesoplenty = "biomesoplenty";
        for (String wood : names)
            new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, wood).register();

        GeneralRegistry.prepareForRegistry(MODID);
    }
}
