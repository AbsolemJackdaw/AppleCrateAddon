package jackdaw.applecrates_botania;

import jackdaw.applecrates.api.AppleCrateAPI;
import jackdaw.applecrates.api.GeneralRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(BotaniaCrates.MODID)
public class BotaniaCrates {
    public static final String MODID = "applecrates_botania";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public BotaniaCrates() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String botaniaModId = "botania";
        new AppleCrateAPI.AppleCrateBuilder(botaniaModId, MODID, "dreamwood").register();
        new AppleCrateAPI.AppleCrateBuilder(botaniaModId, MODID, "livingwood").register();
        new AppleCrateAPI.AppleCrateBuilder(botaniaModId, MODID, "shimmerwood").register();
        new AppleCrateAPI.AppleCrateBuilder(botaniaModId, MODID, "mossy_dreamwood").register();
        new AppleCrateAPI.AppleCrateBuilder(botaniaModId, MODID, "mossy_livingwood").register();
        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
