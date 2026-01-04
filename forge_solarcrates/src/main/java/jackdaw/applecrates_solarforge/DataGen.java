package jackdaw.applecrates_solarforge;

import jackdaw.applecrates.api.DataGenerators;

import net.minecraftforge.fml.common.Mod;

@EventBusSubscriber(modid = SolarCrates.MODID)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent.Client event) {
        DataGenerators.generatedCrates(SolarCrates.MODID, event);
    }
}
