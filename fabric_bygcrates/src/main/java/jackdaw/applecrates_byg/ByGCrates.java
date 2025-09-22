package jackdaw.applecrates_byg;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.fabricmc.api.ModInitializer;

public class ByGCrates implements ModInitializer {

    public static final String MODID = "applecrates_byg";

    @Override
    public void onInitialize() {

        String bygModId = "byg";
        String[] bygWoods = {"aspen", "baobab", "blue_enchanted", "bulbis", "cherry", "cika", "cypress", "ebony", "embur", "ether", "fir", "green_enchanted",
                "holly", "imparius", "jacaranda", "lament", "mahogany", "white_mangrove", "maple", "nightshade", "palm", "pine", "rainbow_eucalyptus",
                "redwood", "skyris", "sythian", "willow", "witch_hazel", "zelkova"};
        for (String woodName : bygWoods)
            new AppleCrateAPI.AppleCrateBuilder(bygModId, MODID, woodName).withSubfolder(woodName + "/").withTextureName("planks").withSuffix("").register();

        GeneralRegistry.prepareForRegistry(MODID);
    }
}
