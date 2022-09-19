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

@Mod(PremiumCrates.MODID)
public class PremiumCrates {
    public static final String MODID = "applecrates_premwood";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public PremiumCrates() {

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);

        String premium_wood = "premium_wood";
        new AppleCrateAPI.AppleCrateBuilder(premium_wood, MODID, "magic").withSubfolder("magic/").register();
        new AppleCrateAPI.AppleCrateBuilder(premium_wood, MODID, "maple").withSubfolder("maple/").register();
        new AppleCrateAPI.AppleCrateBuilder(premium_wood, MODID, "purple_heart").withSubfolder("purple_heart/").register();
        new AppleCrateAPI.AppleCrateBuilder(premium_wood, MODID, "silverbell").withSubfolder("silverbell/").register();
        new AppleCrateAPI.AppleCrateBuilder(premium_wood, MODID, "tiger").withSubfolder("tiger/").register();
        new AppleCrateAPI.AppleCrateBuilder(premium_wood, MODID, "willow").withSubfolder("willow/").register();

        GeneralRegistry.prepareForRegistry(MODID, BLOCKS, ITEMS, BLOCK_ENTITY_TYPES);

    }
}
