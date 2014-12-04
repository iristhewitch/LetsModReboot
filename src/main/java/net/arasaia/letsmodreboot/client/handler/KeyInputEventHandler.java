package net.arasaia.letsmodreboot.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.arasaia.letsmodreboot.client.settings.Keybindings;
import net.arasaia.letsmodreboot.reference.Key;
import net.arasaia.letsmodreboot.util.LogHelper;

public class KeyInputEventHandler {
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed()) {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed()) {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent keyInputEvent) {
        LogHelper.info(getPressedKeybinding());
    }
}