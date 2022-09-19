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
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "cherry").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "dead").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "fir").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "hellbark").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "jacaranda").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "magic").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "mahogany").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "palm").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "redwood").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "umbran").register();
        new AppleCrateAPI.AppleCrateBuilder(biomesoplenty, MODID, "willow").register();

        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }


}
