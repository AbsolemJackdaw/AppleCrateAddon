package jackdaw.applecrates_premwood;

import jackdaw.applecrates.api.DataGenerators;

import net.minecraftforge.fml.common.Mod;

@EventBusSubscriber(modid = PremiumCrates.MODID)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent.Client event) {
        DataGenerators.generatedCrates(PremiumCrates.MODID, event);
    }
}
