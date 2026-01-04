package jackdaw.applecrates_nourishedend;

import jackdaw.applecrates.api.DataGenerators;

import net.minecraftforge.fml.common.Mod;

@EventBusSubscriber(modid = EEndCrates.MODID)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent.Client event) {
        DataGenerators.generatedCrates(EEndCrates.MODID, event);
    }
}
