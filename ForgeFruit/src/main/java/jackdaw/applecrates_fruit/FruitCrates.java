package jackdaw.applecrates_fruit;

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

@Mod(FruitCrates.MODID)
@Mod.EventBusSubscriber(modid = FruitCrates.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FruitCrates {
    public static final String MODID = "applecrates_fruit";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public FruitCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);


        String fruitTreesModId = "fruitfulfun";
        new AppleCrateAPI.AppleCrateBuilder(fruitTreesModId, MODID, "redlove").withBlock("redlove_planks").register();
        new AppleCrateAPI.AppleCrateBuilder(fruitTreesModId, MODID, "citrus").withBlock("citrus_planks").register();

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