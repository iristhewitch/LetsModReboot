package net.arasaia.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.arasaia.letsmodreboot.block.BlockFlag;
import net.arasaia.letsmodreboot.block.BlockLMRB;
import net.arasaia.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }
}
