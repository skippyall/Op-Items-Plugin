package benkralex.opitems;

import org.bukkit.plugin.java.JavaPlugin;

public final class OpItems extends JavaPlugin {

    public OpItems opItems;
    @Override
    public void onEnable() {
        // Plugin startup logic
        opItems = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
