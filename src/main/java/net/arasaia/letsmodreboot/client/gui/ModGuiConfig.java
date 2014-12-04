package net.arasaia.letsmodreboot.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.arasaia.letsmodreboot.handler.ConfigurationHandler;
import net.arasaia.letsmodreboot.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,  // world restart
                false,  // mc restart
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
