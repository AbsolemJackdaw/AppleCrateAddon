package jackdaw.applecrates_bop;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(PlentyCrates.MODID)
public class PlentyCrates {
    public static final String MODID = "applecrates_bop";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public PlentyCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String biomesoplenty = "biomesoplenty";
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "cherry").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "dead").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "fir").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "hellbark").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "jacaranda").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "magic").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "mahogany").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "palm").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "redwood").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "umbran").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, "willow").register(MODID);

        GeneralRegistry.prepareForRegistry(biomesoplenty, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }


}
