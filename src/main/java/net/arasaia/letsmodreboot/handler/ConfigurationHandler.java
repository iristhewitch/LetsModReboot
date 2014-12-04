package net.arasaia.letsmodreboot.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.arasaia.letsmodreboot.reference.Reference;
import net.arasaia.letsmodreboot.util.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        // Create configuration object from given configuration file
        if(configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent configChangedEvent) {
        if(configChangedEvent.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");

        if(configuration.hasChanged()) {
            configuration.save();
        }
    }
}
