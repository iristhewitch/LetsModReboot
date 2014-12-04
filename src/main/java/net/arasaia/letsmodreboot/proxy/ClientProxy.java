package net.arasaia.letsmodreboot.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.arasaia.letsmodreboot.client.settings.Keybindings;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeybindings() {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
