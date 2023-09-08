package benkralex.opitems.commands;

import benkralex.opitems.OpItems;
import benkralex.opitems.items.ItemBuilder;
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.*;
import dev.jorel.commandapi.executors.CommandArguments;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CreateItemCommand {
    public static void createCreateItemCommand() {
        new CommandAPICommand("createitem")
                .executesPlayer((sender, args)->{createItem(sender, args);})
                .withUsage("")
                .withHelp("Neue Items erstellen", "Neue Items erstellen, ohne NBT-Tags auswendig zu lernen.")
                .withPermission("opitems.create")
                .withArguments(new ItemStackArgument("Item"), new BooleanArgument("unbreakable"), new StringArgument("Name"), new StringArgument("Lore"), new MapArgumentBuilder<Enchantment, Integer>("Enchantments").withKeyMapper(Enchantment.getByKey(string -> {new NamespacedKey(NamespacedKey.MINECRAFT, string)})))
                .register();
    }
    public static void createItem(Player sender, CommandArguments args) {
        HashMap<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
        List lore = new ArrayList<>();
        lore.add(args.get("Lore"));
        ItemBuilder.buildItem(((ItemStack) args.get("Item")).getType(), (Boolean) args.get("unbreakable"), ChatColor.translateAlternateColorCodes('§', (String) args.get("Name")), enchantments, lore, "");
    }
}
