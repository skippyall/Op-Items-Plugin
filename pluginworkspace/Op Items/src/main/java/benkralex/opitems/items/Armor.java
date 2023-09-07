package benkralex.opitems.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Armor {

    public static ItemStack getArmorItem(Type type, boolean unbreakable, MaterialType material, int swiftsneaklevel, int protlevel, int depthlevel, int soullevel, int fallprotlevel, int resplevel, int unbreklevel) {
        ItemStack i;
        ItemMeta m;
        if (type == Type.HELMET) {
            i = new ItemStack(Material.valueOf(material.materialname + "_HELMET"));
            m = i.getItemMeta();
            m.addEnchant(Enchantment.OXYGEN, resplevel, true);
            m.addEnchant(Enchantment.WATER_WORKER, 1, true);
        } else if (type == Type.CHESTPLATE) {
            i = new ItemStack(Material.valueOf(material.materialname + "_CHESTPLATE"));
            m = i.getItemMeta();
        } else if (type == Type.LEGGINGS) {
            i = new ItemStack(Material.valueOf(material.materialname + "_LEGGINGS"));
            m = i.getItemMeta();
            m.addEnchant(Enchantment.SWIFT_SNEAK, swiftsneaklevel, true);
        } else if (type == Type.BOOTS) {
            i = new ItemStack(Material.valueOf(material.materialname + "_BOOTS"));
            m = i.getItemMeta();
            m.addEnchant(Enchantment.SOUL_SPEED, soullevel, true);
            m.addEnchant(Enchantment.DEPTH_STRIDER, depthlevel, true);
            m.addEnchant(Enchantment.PROTECTION_FALL, fallprotlevel, true);
        } else {
            return null;
        }
        m.setUnbreakable(unbreakable);
        if (!unbreakable) {
            m.addEnchant(Enchantment.DURABILITY, unbreklevel, true);
            m.addEnchant(Enchantment.MENDING, 1, true);
        }
        m.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, protlevel, true);
        i.setItemMeta(m);
        return i;
    }

    public enum Type {
        HELMET,
        CHESTPLATE,
        LEGGINGS,
        BOOTS,
    }

    public enum MaterialType {
        LEATHER("LEATHER"),
        CHAINMAIL("CHAINMAIL"),
        IRON("IRON"),
        DIAMOND("DIAMOND"),
        GOLD("GOLD"),
        NETHERITE("NETHERITE");
        String materialname;
        MaterialType(String materialname) {
            this.materialname = materialname;
        }
    }
}
