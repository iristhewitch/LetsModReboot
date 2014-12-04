package net.arasaia.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.arasaia.letsmodreboot.item.ItemLMRB;
import net.arasaia.letsmodreboot.item.ItemMapleLeaf;
import net.arasaia.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
