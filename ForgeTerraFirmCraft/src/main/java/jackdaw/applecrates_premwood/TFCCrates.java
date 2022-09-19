package jackdaw.applecrates_premwood;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(TFCCrates.MODID)
public class TFCCrates {
    public static final String MODID = "applecrates_tfc";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public TFCCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String tfc_mod_id = "tfc";
        var woods = new String[]{
                "acacia", "aspen", "birch", "blackwood", "chestnut", "douglas_fir", "hickory", "kapok", "maple", "oak", "palm", "pine", "rosewood",
                "sequoia", "spruce", "sycamore", "white_cedar", "willow"
        };
        String plankLocation = "wood/planks/";
        for (String woodName : woods)
            new AppleCrateAPI.AppleCrateBuilder(tfc_mod_id, MODID, woodName).withSubfolder(plankLocation).withSuffix("").withBlock(plankLocation + woodName).register();


        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
