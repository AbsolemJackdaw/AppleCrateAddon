package jackdaw.applecrates_premwood.compat;

import jackdaw.applecrates.api.AppleCrateAPI.AppleCrateBuilder;

public enum LocalCompat {

    INSTANCE;

    public void init() {
        String premium_wood = "premium_wood";
        new AppleCrateBuilder(premium_wood, "magic").withSubfolder("magic/").register();
        new AppleCrateBuilder(premium_wood, "maple").withSubfolder("maple/").register();
        new AppleCrateBuilder(premium_wood, "purple_heart").withSubfolder("purple_heart/").register();
        new AppleCrateBuilder(premium_wood, "silverbell").withSubfolder("silverbell/").register();
        new AppleCrateBuilder(premium_wood, "tiger").withSubfolder("tiger/").register();
        new AppleCrateBuilder(premium_wood, "willow").withSubfolder("willow/").register();

    }
}
