package benkralex.opitems.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ItemBuilder {

    public static ItemStack buildItem(Material itemtype, Boolean unbreakable, String displayname, Map<Enchantment, Integer> enchantments, List lore, String localizedName) {
        ItemStack i = new ItemStack(itemtype);
        ItemMeta m = i.getItemMeta();
        Iterator iterator = enchantments.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Enchantment, Integer> entry = (Map.Entry)iterator.next();
            Enchantment enchantment;
            int enchantmentlevel;
            if (entry.getValue() != null && entry.getKey() != null) {
                enchantment = entry.getKey();
                enchantmentlevel = entry.getValue();
                m.addEnchant(enchantment, enchantmentlevel, true);
            }
        }
        m.setUnbreakable(unbreakable);
        m.setDisplayName(displayname);
        m.setLore(lore);
        m.setLocalizedName(localizedName);
        i.setItemMeta(m);
        return i;
    }
}
