package benkralex.opitems;

import benkralex.opitems.commands.GiveCommand;
import benkralex.opitems.config.Config;
import benkralex.opitems.listeners.DropListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpItems extends JavaPlugin {

    public static OpItems opItems;
    @Override
    public void onEnable() {
        // Plugin startup logic
        opItems = this;
        getLogger().info("OP-Items Plugin gestartet:");
        getLogger().info("Im Survival bekommbar:" + (Config.getSurvivalObtainable()?"Ja":"Nein"));
        Bukkit.getPluginManager().registerEvents(new DropListener(), opItems);
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
