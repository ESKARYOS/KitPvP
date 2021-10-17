package dev.com.eskaryos.kitpvp.menus;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class KitSelector {

    public static void openKits(Player p){
        Inventory inv = Bukkit.createInventory(p,54,"§7Menu de Kits");
        p.openInventory(inv);
    }

}
