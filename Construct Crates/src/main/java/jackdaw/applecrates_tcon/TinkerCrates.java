package jackdaw.applecrates_tcon;

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

@Mod(TinkerCrates.MODID)
@Mod.EventBusSubscriber(modid = TinkerCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TinkerCrates {
    public static final String MODID = "applecrates_tcon";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public TinkerCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String tinkersconstructmodid = "tconstruct";
        var woods = new String[]{"enderbark", "greenheart", "skyroot", "bloodshroom"};
        var woods_2 = new String[]{"blazewood", "lavawood", "nahuatl", "purple_slimewood"};

        for (String woodName : woods_2)
            new AppleCrateAPI.AppleCrateBuilder(tinkersconstructmodid, MODID, woodName).withSubfolder("wood/").withSuffix("").register();

        for (String woodName : woods)
            new AppleCrateAPI.AppleCrateBuilder(tinkersconstructmodid, MODID, woodName).withTextureName("planks").withSuffix("").withSubfolder("wood/" + woodName + "/").register();

        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);
    }

    @SubscribeEvent
    public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(GeneralRegistry.CRATE_TAB.getKey())) {
            for (RegistryObject<Item> item : ITEMS.getEntries())
                event.accept(item);
        }
    }
}
