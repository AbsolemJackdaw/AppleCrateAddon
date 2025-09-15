package jackdaw.applecrates_solarforge;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(SolarCrates.MODID)
@Mod.EventBusSubscriber(modid = SolarCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SolarCrates {
    public static final String MODID = "applecrates_solarforge";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public SolarCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String solarforgeModId = "solarforge";
        var woods = new String[]{"radiant", "runic"};
        for (String woodName : woods)
            new AppleCrateAPI.AppleCrateBuilder(solarforgeModId, MODID, woodName).register();

        GeneralRegistry.prepareForRegistry(solarforgeModId, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }

    @SubscribeEvent
    public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(GeneralRegistry.CRATE_TAB.getKey())) {
            for (RegistryObject<Item> item : ITEMS.getEntries())
                event.accept(item);
        }
    }
}
