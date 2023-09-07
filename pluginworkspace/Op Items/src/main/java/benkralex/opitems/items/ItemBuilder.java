package benkralex.opitems.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemBuilder {

    public static ItemStack buildItem(Material itemtype, Boolean unbreakable, String displayname, Map<Enchantment, Integer> enchantments, List lore, boolean hideItemFlag, String localizedName) {
        ItemStack i = new ItemStack(itemtype);
        ItemMeta m = i.getItemMeta();
        m.setUnbreakable(unbreakable);
        m.setDisplayName(displayname);
        m.setLore(lore);
        m.setLocalizedName(localizedName);
        i.setItemMeta(m);
        return i;
    }
}
