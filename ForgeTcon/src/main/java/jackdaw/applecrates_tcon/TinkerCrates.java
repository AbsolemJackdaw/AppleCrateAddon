package jackdaw.applecrates_tcon;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(TinkerCrates.MODID)
public class TinkerCrates {
    public static final String MODID = "applecrates_tcon";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public TinkerCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String tinkersconstructmodid = "tconstruct";
        new AppleCrateAPI.AppleCrateBuilder(tinkersconstructmodid, "nahuatl").withSubfolder("wood/").withSuffix("").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(tinkersconstructmodid, "greenheart").withTextureName("planks").withSuffix("").withSubfolder("wood/greenheart/").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(tinkersconstructmodid, "skyroot").withTextureName("planks").withSuffix("").withSubfolder("wood/skyroot/").register(MODID);
        new AppleCrateAPI.AppleCrateBuilder(tinkersconstructmodid, "bloodshroom").withTextureName("planks").withSuffix("").withSubfolder("wood/bloodshroom/").register(MODID);

        GeneralRegistry.prepareForRegistry(tinkersconstructmodid, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
