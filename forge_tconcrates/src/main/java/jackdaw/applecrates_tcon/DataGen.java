package jackdaw.applecrates_tcon;

import jackdaw.applecrates.api.DataGenerators;

import net.minecraftforge.fml.common.Mod;

@EventBusSubscriber(modid = TinkerCrates.MODID)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent.Client event) {
        DataGenerators.generatedCrates(TinkerCrates.MODID, event);
    }
}
