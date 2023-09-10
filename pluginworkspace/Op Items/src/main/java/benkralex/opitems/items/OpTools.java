package benkralex.opitems.items;

import benkralex.opitems.config.Config;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpTools {
    public static ItemStack opSword() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.DIG_SPEED, 6);
        enchantments.put(Enchantment.DAMAGE_ALL, 6);
        enchantments.put(Enchantment.DAMAGE_ARTHROPODS, 3);
        enchantments.put(Enchantment.DAMAGE_UNDEAD, 3);
        enchantments.put(Enchantment.SWEEPING_EDGE, 4);
        enchantments.put(Enchantment.FIRE_ASPECT, 4);
        if (Config.getKnockback()) {
            enchantments.put(Enchantment.KNOCKBACK, 10);
        }
        enchantments.put(Enchantment.LOOT_BONUS_MOBS, 4);
        return ItemBuilder.buildItem(Material.DIAMOND_SWORD, true, "OP-Diamond-Sword", enchantments, Config.getRareityLore(), "opsword");
    }
    public static ItemStack opAxe(boolean silktouch) {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.DIG_SPEED, 6);
        enchantments.put(Enchantment.DAMAGE_ALL, 6);
        enchantments.put(Enchantment.DAMAGE_ARTHROPODS, 3);
        enchantments.put(Enchantment.DAMAGE_UNDEAD, 3);
        enchantments.put(Enchantment.LOOT_BONUS_MOBS, 4);
        if (silktouch) {
            enchantments.put(Enchantment.SILK_TOUCH, 1);
        } else {
            enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 4);
        }
        return ItemBuilder.buildItem(Material.DIAMOND_AXE, true, "OP-Diamond-Axe", enchantments, Config.getRareityLore(), "opaxe");
    }
    public static ItemStack opPickaxe(boolean silktouch) {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.DIG_SPEED, 6);
        if (silktouch) {
            enchantments.put(Enchantment.SILK_TOUCH, 1);
        } else {
            enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 4);
        }
        List lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Epic");
        return ItemBuilder.buildItem(Material.DIAMOND_PICKAXE, true, "OP-Diamond-Pickaxe", enchantments, Config.getRareityLore(), "oppickaxe");
    }
    public static ItemStack opShovel(boolean silktouch) {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.DIG_SPEED, 6);
        if (silktouch) {
            enchantments.put(Enchantment.SILK_TOUCH, 1);
        } else {
            enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 4);
        }
        return ItemBuilder.buildItem(Material.DIAMOND_SHOVEL, true, "OP-Diamond-Shovel", enchantments, Config.getRareityLore(), "opshovel");
    }
    public static ItemStack opHoe(boolean silktouch) {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.DIG_SPEED, 6);
        if (silktouch) {
            enchantments.put(Enchantment.SILK_TOUCH, 1);
        } else {
            enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 4);
        }
        return ItemBuilder.buildItem(Material.DIAMOND_HOE, true, "OP-Diamond-Hoe", enchantments, Config.getRareityLore(), "ophoe");
    }
    public static ItemStack opBow() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.ARROW_DAMAGE, 6);
        enchantments.put(Enchantment.ARROW_FIRE, 1);
        enchantments.put(Enchantment.ARROW_INFINITE, 1);
        enchantments.put(Enchantment.ARROW_KNOCKBACK, 4);
        return ItemBuilder.buildItem(Material.BOW, true, "OP-Bow", enchantments, Config.getRareityLore(), "opbow");
    }
    public static ItemStack opCrossbow() {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        enchantments.put(Enchantment.LOOT_BONUS_MOBS, 3);
        enchantments.put(Enchantment.QUICK_CHARGE, 5);
        enchantments.put(Enchantment.MULTISHOT, 1);
        enchantments.put(Enchantment.PIERCING, 5);
        return ItemBuilder.buildItem(Material.CROSSBOW, true, "OP-Crossbow", enchantments, Config.getRareityLore(), "opcrossbow");
    }
}
