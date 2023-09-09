package benkralex.opitems;

import benkralex.opitems.commands.GiveCommand;
import benkralex.opitems.config.Config;
import org.bukkit.loot.LootTable;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpItems extends JavaPlugin {

    public static OpItems opItems;
    @Override
    public void onEnable() {
        // Plugin startup logic
        opItems = this;
        Config.createConfig();
    }

    public void onLoad() {
        // Plugin load logic
        GiveCommand.createCommand();
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
