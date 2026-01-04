package jackdaw.applecrates_byg;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(BygCrates.MODID)
public class BygCrates {
    public static final String MODID = "applecrates_byg";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MODID);

    public BygCrates(IEventBus bus){
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);
        String bygModId = "biomeswevegone";
        String[] bygWoods = {"aspen", "baobab", "blue_enchanted", "cika", "cypress", "ebony", "fir", "green_enchanted",
                "holly", "jacaranda", "mahogany", "white_mangrove", "maple", "palm", "pine", "rainbow_eucalyptus",
                "redwood", "skyris", "willow", "witch_hazel", "zelkova"};
        for (String woodName : bygWoods)
            new AppleCrateAPI.AppleCrateBuilder(bygModId, MODID, woodName).withSubfolder(woodName + "/").withTextureName("planks").withSuffix("").register();

        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
