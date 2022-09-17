package jackdaw.applecrates_forbarc;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(ArcanusCrates.MODID)
public class ArcanusCrates {
    public static final String MODID = "applecrates_forbarc";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public ArcanusCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String forbidden_arcanus = "forbidden_arcanus";
        new AppleCrateAPI.AppleCrateBuilder(forbidden_arcanus, "cherrywood").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(forbidden_arcanus, "edelwood").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(forbidden_arcanus, "fungyss").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(forbidden_arcanus, "mysterywood").register(MODID);

        GeneralRegistry.prepareForRegistry(forbidden_arcanus, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
