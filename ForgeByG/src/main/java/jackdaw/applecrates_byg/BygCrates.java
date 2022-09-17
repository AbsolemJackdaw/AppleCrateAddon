package jackdaw.applecrates_byg;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(BygCrates.MODID)
public class BygCrates {
    public static final String MODID = "applecrates_byg";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public BygCrates() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);
        String bygModId = "byg";
        String[] bygWoods = {"aspen", "baobab", "blue_enchanted", "bulbis", "cherry", "cika", "cypress", "ebony", "embur", "ether", "fir", "green_enchanted",
                "holly", "imparius", "jacaranda", "lament", "mahogany", "white_mangrove", "maple", "nightshade", "palm", "pine", "rainbow_eucalyptus",
                "redwood", "skyris", "sythian", "willow", "witch_hazel", "zelkova"};
        for (String woodName : bygWoods)
            new AppleCrateAPI.AppleCrateBuilder(bygModId, woodName).withSubfolder(woodName + "/").withTextureName("planks").withSuffix("").register(MODID);

        GeneralRegistry.prepareForRegistry(bygModId, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
