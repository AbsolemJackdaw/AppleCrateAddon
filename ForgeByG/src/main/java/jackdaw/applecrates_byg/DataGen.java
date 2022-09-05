package jackdaw.applecrates_byg;

import jackdaw.applecrates.datagen.DataGenerators;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BygCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent event) {
        DataGenerators.generatedCrates(BygCrates.MODID, event);
    }
}
