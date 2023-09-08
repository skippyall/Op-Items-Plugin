package benkralex.opitems.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpArmor {
    public static ItemStack opChestplate() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        List lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Epic");
        return ItemBuilder.buildItem(Material.DIAMOND_CHESTPLATE, true, "OP-Diamond-Chestplate", enchantments, lore, "opchestplate");
    }

    public static ItemStack opHelmet() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        enchantments.put(Enchantment.OXYGEN, 5);
        enchantments.put(Enchantment.WATER_WORKER, 2);
        List lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Epic");
        return ItemBuilder.buildItem(Material.DIAMOND_HELMET, true, "OP-Diamond-Helmet", enchantments, lore, "ophelmet");
    }

    public static ItemStack opLeggings() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        enchantments.put(Enchantment.PROTECTION_EXPLOSIONS, 3);
        enchantments.put(Enchantment.PROTECTION_FIRE, 3);
        enchantments.put(Enchantment.PROTECTION_PROJECTILE, 3);
        enchantments.put(Enchantment.SWIFT_SNEAK, 4);
        List lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Epic");
        return ItemBuilder.buildItem(Material.DIAMOND_LEGGINGS, true, "OP-Diamond-Leggings", enchantments, lore, "opleggings");
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
        List lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Epic");
        return ItemBuilder.buildItem(Material.DIAMOND_BOOTS, true, "OP-Diamond-Boots", enchantments, lore, "opboots");
    }
}
