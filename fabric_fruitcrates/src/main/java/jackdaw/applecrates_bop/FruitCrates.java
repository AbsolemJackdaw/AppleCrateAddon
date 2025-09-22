package jackdaw.applecrates_bop;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.fabricmc.api.ModInitializer;

public class FruitCrates implements ModInitializer {

    public static final String MODID = "applecrates_fruit";

    @Override
    public void onInitialize() {

        String fruitTreesModId = "fruitfulfun";
        new AppleCrateAPI.AppleCrateBuilder(fruitTreesModId, MODID, "redlove").withBlock("redlove_planks").register();
        new AppleCrateAPI.AppleCrateBuilder(fruitTreesModId, MODID, "citrus").withBlock("citrus_planks").register();

        GeneralRegistry.prepareForRegistry(MODID);
    }
}

