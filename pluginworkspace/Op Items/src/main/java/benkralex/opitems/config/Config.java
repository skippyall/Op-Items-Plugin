package benkralex.opitems.config;

import benkralex.opitems.OpItems;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Config {
    private static final FileConfiguration config = OpItems.opItems.getConfig();

    public static void createConfig() {
        config.options().copyDefaults(true);
        config.addDefault("rareity.name", "§6§k§laa§r§6§l Legendary §r§6§k§laa");
        config.addDefault("knockback", true);
        config.addDefault("survival-obtainable", true);
        OpItems.opItems.saveConfig();
    }

    public static List getRareityLore() {
        List l = new ArrayList<>();
        if (config.get("rareity.name") == null) return l;
        String name = ChatColor.translateAlternateColorCodes('§', (String) config.get("rareity.name"));
        l.add("");
        l.add(name);
        return l;
    }

    public static boolean getKnockback() {
        if (config.get("knockback") == null) return true;
        return (boolean) config.get("knockback");
    }

    public static boolean getSurvivalObtainable() {
        return config.getBoolean("survival-obtainable");
    }
}
