package jackdaw.applecrates_byg;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.fabricmc.api.ModInitializer;

public class ByGCrates implements ModInitializer {

    public static final String MODID = "applecrates_byg";

    @Override
    public void onInitialize() {

        String bygModId = "biomeswevegone";
        String[] bygWoods = {"aspen", "baobab", "blue_enchanted", "cika", "cypress", "ebony", "fir", "green_enchanted",
                "holly", "jacaranda", "mahogany", "white_mangrove", "maple", "palm", "pine", "rainbow_eucalyptus",
                "redwood", "skyris", "willow", "witch_hazel", "zelkova"};
        for (String woodName : bygWoods)
            new AppleCrateAPI.AppleCrateBuilder(bygModId, MODID, woodName).withSubfolder(woodName + "/").withTextureName("planks").withSuffix("").register();

        GeneralRegistry.prepareForRegistry(MODID);
    }
}
