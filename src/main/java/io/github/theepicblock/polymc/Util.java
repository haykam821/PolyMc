package io.github.theepicblock.polymc;

import net.minecraft.util.Identifier;

public class Util {
    public static boolean isVanilla(Identifier id) {
        return id.getNamespace().equals("minecraft");
    }
}
