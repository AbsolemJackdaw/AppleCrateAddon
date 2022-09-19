package jackdaw.applecrates_nourishedend;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(EEndCrates.MODID)
public class EEndCrates {
    public static final String MODID = "applecrates_nourishedend";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public EEndCrates() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String nourished_end = "nourished_end";
        new AppleCrateAPI.AppleCrateBuilder(nourished_end, MODID, "cerulean").withParentFolder("blocks/").register();
        new AppleCrateAPI.AppleCrateBuilder(nourished_end, MODID, "seldge").withParentFolder("blocks/").register();
        new AppleCrateAPI.AppleCrateBuilder(nourished_end, MODID, "verdant").withParentFolder("blocks/").register();

        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
