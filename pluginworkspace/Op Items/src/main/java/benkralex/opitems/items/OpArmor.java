package benkralex.opitems.items;

import benkralex.opitems.config.Config;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class OpArmor {
    public static ItemStack opChestplate() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        return ItemBuilder.buildItem(Material.DIAMOND_CHESTPLATE, true, "OP-Diamond-Chestplate", enchantments, Config.getRareityLore(), "opchestplate");
    }

    public static ItemStack opHelmet() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        enchantments.put(Enchantment.OXYGEN, 5);
        enchantments.put(Enchantment.WATER_WORKER, 2);
        return ItemBuilder.buildItem(Material.DIAMOND_HELMET, true, "OP-Diamond-Helmet", enchantments, Config.getRareityLore(), "ophelmet");
    }

    public static ItemStack opLeggings() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        enchantments.put(Enchantment.SWIFT_SNEAK, 4);
        return ItemBuilder.buildItem(Material.DIAMOND_LEGGINGS, true, "OP-Diamond-Leggings", enchantments, Config.getRareityLore(), "opleggings");
    }

    public static ItemStack opBoots() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        enchantments.put(Enchantment.PROTECTION_FALL, 5);
        enchantments.put(Enchantment.SOUL_SPEED, 4);
        enchantments.put(Enchantment.DEPTH_STRIDER, 4);
        return ItemBuilder.buildItem(Material.DIAMOND_BOOTS, true, "OP-Diamond-Boots", enchantments, Config.getRareityLore(), "opboots");
    }
    public static ItemStack opElytra() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        return ItemBuilder.buildItem(Material.ELYTRA, true, "OP-Elytra", enchantments, Config.getRareityLore(), "opelytra");
    }
}
