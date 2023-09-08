package benkralex.opitems;

import benkralex.opitems.commands.GiveCommand;
import org.bukkit.loot.LootTable;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpItems extends JavaPlugin {

    public OpItems opItems;
    @Override
    public void onEnable() {
        // Plugin startup logic
        opItems = this;
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
