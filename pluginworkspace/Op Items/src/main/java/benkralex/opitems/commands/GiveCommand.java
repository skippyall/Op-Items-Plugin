package benkralex.opitems.commands;

import benkralex.opitems.OpItems;
import benkralex.opitems.items.OpArmor;
import benkralex.opitems.items.OpTools;
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.BooleanArgument;
import dev.jorel.commandapi.arguments.CommandArgument;
import dev.jorel.commandapi.arguments.MultiLiteral;
import dev.jorel.commandapi.arguments.MultiLiteralArgument;
import dev.jorel.commandapi.executors.CommandArguments;
import org.bukkit.entity.Player;

public class GiveCommand {
    public static void createCommand() {
        new CommandAPICommand("opgive")
                .withPermission("opitems.give")
                .withSubcommand(new CommandAPICommand("armor")
                    .withArguments(new MultiLiteralArgument("Armortype", "Helmet", "Chestplate", "Leggings", "Boots"))
                    .executesPlayer((sender, args)->{getArmor(sender, args);}))
                .withSubcommand(new CommandAPICommand("tools")
                    .withArguments(new MultiLiteralArgument("Tooltype", "Sword", "Axe", "Pickaxe", "Shovel", "Hoe"), new BooleanArgument("SilkTouch"))
                    .executesPlayer((sender, args)->{getTool(sender, args);}))
                .register();
    }
    public static void getArmor(Player p, CommandArguments args) {
        if (args.get("Armortype").equals("Helmet")) {
            p.getInventory().addItem(OpArmor.opHelmet());
        } else if (args.get("Armortype").equals("Chestplate")) {
            p.getInventory().addItem(OpArmor.opChestplate());
        } else if (args.get("Armortype").equals("Leggings")) {
            p.getInventory().addItem(OpArmor.opLeggings());
        } else if (args.get("Armortype").equals("Boots")) {
            p.getInventory().addItem(OpArmor.opBoots());
        }
    }
    public static void getTool(Player p, CommandArguments args) {
        if (args.get("Tooltype").equals("Sword")) {
            p.getInventory().addItem(OpTools.opSword());
        } else if (args.get("Tooltype").equals("Axe")) {
            p.getInventory().addItem(OpTools.opAxe((boolean) args.get("SilkTouch")));
        } else if (args.get("Tooltype").equals("Pickaxe")) {
            p.getInventory().addItem(OpTools.opPickaxe((boolean) args.get("SilkTouch")));
        } else if (args.get("Tooltype").equals("Shovel")) {
            p.getInventory().addItem(OpTools.opShovel((boolean) args.get("SilkTouch")));
        } else if (args.get("Tooltype").equals("Hoe")) {
            p.getInventory().addItem(OpTools.opHoe((boolean) args.get("SilkTouch")));
        }
    }
}
