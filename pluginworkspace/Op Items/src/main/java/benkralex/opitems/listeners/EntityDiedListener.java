package benkralex.opitems.listeners;

import benkralex.opitems.config.Config;
import benkralex.opitems.items.OpArmor;
import benkralex.opitems.items.OpTools;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class EntityDiedListener implements Listener {
    @EventHandler
    public static void onEntityDeath(EntityDeathEvent e) {
        if (!Config.getSurvivalObtainable()) return;
        Random random = new Random();
        int randomint = random.nextInt(0, 200);
        Location location = e.getEntity().getLocation();
        if (e.getEntity() instanceof Drowned) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    location.getWorld().dropItemNaturally(location, OpTools.opTrident(true));
                    Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Trident ist gefunden worden");
                } else if (randomint == 1) {
                    location.getWorld().dropItemNaturally(location,OpTools.opTrident(false));
                    Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Trident ist gefunden worden");
                }
            }
        } else if (e.getEntity() instanceof Pillager) {
            if (randomint == 0 || randomint == 1) {
                location.getWorld().dropItemNaturally(location, OpTools.opCrossbow());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Crossbow ist gefunden worden");
            }
        } else if (e.getEntity() instanceof Skeleton) {
            if (randomint == 0 || randomint == 1) {
                location.getWorld().dropItemNaturally(location, OpTools.opBow());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Bow ist gefunden worden");
            }
        } else if (e.getEntity() instanceof ElderGuardian) {
            if (randomint > 5) {
                location.getWorld().dropItemNaturally(location, OpArmor.opChestplate());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Chestplate ist gefunden worden");
            }
        } else if (e.getEntity() instanceof Guardian) {
            if (randomint == 0 || randomint == 1) {
                location.getWorld().dropItemNaturally(location, OpArmor.opLeggings());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Leggings ist gefunden worden");
            }
        } else if (e.getEntity() instanceof Phantom) {
            if (randomint > 5) {
                location.getWorld().dropItemNaturally(location, OpArmor.opElytra());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Elytra ist gefunden worden");
            }
        } else if (e.getEntity() instanceof Creeper) {
            if (randomint == 0 || randomint == 1) {
                location.getWorld().dropItemNaturally(location, OpArmor.opHelmet());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Helmet ist gefunden worden");
            }
        } else if (e.getEntity() instanceof Rabbit) {
            if (randomint == 0 || randomint == 1) {
                location.getWorld().dropItemNaturally(location, OpArmor.opBoots());
                Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Boots sind gefunden worden");
            }
        } else if (e.getEntity() instanceof WitherSkeleton) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    location.getWorld().dropItemNaturally(location, OpTools.opSword(true));
                    Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Sword ist gefunden worden");
                } else if (randomint == 1) {
                    location.getWorld().dropItemNaturally(location,OpTools.opSword(false));
                    Bukkit.broadcastMessage(ChatColor.GOLD + "Op-Sword ist gefunden worden");
                }
            }
        }
    }
}
