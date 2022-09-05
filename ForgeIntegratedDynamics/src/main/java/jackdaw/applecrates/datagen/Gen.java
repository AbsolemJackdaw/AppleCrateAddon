package jackdaw.applecrates.datagen;

import jackdaw.applecrates.AppleCrates;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AppleCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Gen {

    @SubscribeEvent
    public static void gen(GatherDataEvent event) {
        DataGenerators.generatedCrates(AppleCrates.MODID, event);
    }
}
