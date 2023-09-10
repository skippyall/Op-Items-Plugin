package benkralex.opitems.listeners;

import benkralex.opitems.OpItems;
import benkralex.opitems.config.Config;
import benkralex.opitems.items.OpTools;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;
import java.util.logging.Logger;

public class DropListener implements Listener {
    @EventHandler
    public static void onLootGenerate(BlockBreakEvent e) {
        if (Config.getSurvivalObtainable()) return;
        Random random = new Random();
        Logger logger = OpItems.opItems.getLogger();
        int randomint = random.nextInt(0, 200);
        Location location = e.getBlock().getLocation();
        if (e.getBlock().getType().equals(Material.OAK_LOG)) {
            if (randomint == 0 || randomint == 1) {
                if (randomint == 0) {
                    logger.warning("Silktouch");
                    location.getWorld().dropItemNaturally(location,OpTools.opAxe(true));
                } else if (randomint == 1) {
                    logger.warning("Glück");
                    location.getWorld().dropItemNaturally(location,OpTools.opAxe(false));
                }
            } else {
                location.getWorld().dropItemNaturally(location, OpTools.opBow());
            }
        }
    }
}