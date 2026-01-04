package jackdaw.applecrates_malum;

import jackdaw.applecrates.api.DataGenerators;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MalumCrates.MODID)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent.Client event) {
        DataGenerators.generatedCrates(MalumCrates.MODID, event);
    }
}
