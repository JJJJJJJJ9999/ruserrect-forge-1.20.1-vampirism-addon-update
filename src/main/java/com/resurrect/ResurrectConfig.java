package com.resurrect;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ResurrectConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.IntValue MIN_VAMPIRE_LEVEL;

    static {
        ForgeConfigSpec.Builder b = new ForgeConfigSpec.Builder();
        MIN_VAMPIRE_LEVEL = b
                .comment("Minimum Vampirism vampire level that gets the Resurrect button on the death screen (any death except sunlight/stakes).",
                        "Lower level vampires die normally. Vampirism 2.0 also uses 4.")
                .defineInRange("minVampireLevel", 4, 1, 14);
        SPEC = b.build();
    }

    private ResurrectConfig() { }
}
