package jackdaw.applecrates_premwood;

import jackdaw.applecrates.datagen.DataGenerators;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = PremiumCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void gen(GatherDataEvent event) {
        DataGenerators.generatedCrates(PremiumCrates.MODID, event);
    }
}
