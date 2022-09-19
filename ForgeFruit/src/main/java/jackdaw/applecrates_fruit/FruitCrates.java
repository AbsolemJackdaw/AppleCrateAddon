package jackdaw.applecrates_fruit;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(FruitCrates.MODID)
public class FruitCrates {
    public static final String MODID = "applecrates_fruit";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public FruitCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);


        String fruitTreesModId = "fruittrees";
        new AppleCrateAPI.AppleCrateBuilder(fruitTreesModId, MODID, "cherry").withSubfolder("fruittrees/").textureInMinecraftDirectory().withBlock("cherry_planks").register();
        new AppleCrateAPI.AppleCrateBuilder(fruitTreesModId, MODID, "citrus").withSubfolder("fruittrees/").withTextureName("planks").withSuffix("").textureInMinecraftDirectory().withBlock("citrus_planks").register(); //citrus wood is called plank...

        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
