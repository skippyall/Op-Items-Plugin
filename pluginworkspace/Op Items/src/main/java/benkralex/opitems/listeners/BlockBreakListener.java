package benkralex.opitems.listeners;

import benkralex.opitems.OpItems;
import benkralex.opitems.config.Config;
import benkralex.opitems.items.OpTools;
import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;
import java.util.logging.Logger;

public class BlockBreakListener implements Listener {
    @EventHandler
    public static void onBlockBreak(BlockBreakEvent e) {
        if (!Config.getSurvivalObtainable()) return;
        Random random = new Random();
        int randomint = random.nextInt(0, 1000);
        Location location = e.getBlock().getLocation();
        if (e.getBlock().getType().equals(Material.CHERRY_LOG)) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    location.getWorld().dropItemNaturally(location,OpTools.opAxe(true));
                } else if (randomint == 1) {
                    location.getWorld().dropItemNaturally(location,OpTools.opAxe(false));
                }
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Axe ist gefunden worden");
            }
        } else if (e.getBlock().getType().equals(Material.DEEPSLATE)) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    location.getWorld().dropItemNaturally(location,OpTools.opPickaxe(true));
                } else if (randomint == 1) {
                    location.getWorld().dropItemNaturally(location,OpTools.opPickaxe(false));
                }
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Pickaxe ist gefunden worden");
            }
        } else if (e.getBlock().getType().equals(Material.BEETROOTS) && e.getBlock().getState().equals(CropState.RIPE)) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    location.getWorld().dropItemNaturally(location,OpTools.opHoe(true));
                } else if (randomint == 1) {
                    location.getWorld().dropItemNaturally(location,OpTools.opHoe(false));
                }
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Hoe ist gefunden worden");
            }
        } else if (e.getBlock().getType().equals(Material.MUD)) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    location.getWorld().dropItemNaturally(location,OpTools.opShovel(true));
                } else if (randomint == 1) {
                    location.getWorld().dropItemNaturally(location,OpTools.opShovel(false));
                }
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Shovel ist gefunden worden");
            }
        }
    }
}