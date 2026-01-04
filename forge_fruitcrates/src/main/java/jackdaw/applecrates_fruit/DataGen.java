package jackdaw.applecrates_fruit;

import jackdaw.applecrates.api.DataGenerators;

import net.minecraftforge.fml.common.Mod;

@EventBusSubscriber(modid = FruitCrates.MODID)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent.Client event) {
        DataGenerators.generatedCrates(FruitCrates.MODID, event);
    }
}
