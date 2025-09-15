package jackdaw.applecrates_botania;

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

@Mod(BotaniaCrates.MODID)
@Mod.EventBusSubscriber(modid = BotaniaCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BotaniaCrates {
    public static final String MODID = "applecrates_botania";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public BotaniaCrates() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String botaniaModId = "botania";
        var woods = new String[]{"dreamwood", "livingwood", "shimmerwood", "mossy_dreamwood", "mossy_livingwood"};
        for (String woodName : woods)
            new AppleCrateAPI.AppleCrateBuilder(botaniaModId, MODID, woodName).register();

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
