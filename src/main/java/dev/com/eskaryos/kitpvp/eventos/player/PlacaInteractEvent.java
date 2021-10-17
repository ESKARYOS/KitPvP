package dev.com.eskaryos.kitpvp.eventos.player;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import dev.com.eskaryos.kitpvp.utils.JavaUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlacaInteractEvent extends Listeners {


    @EventHandler
    public void placa (PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(!e.getClickedBlock().getType().equals(Material.WALL_SIGN))return;
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            Sign sign = (Sign) e.getClickedBlock().getState();
            if(sign.getLine(1).equalsIgnoreCase("§c[Sopas]")){
                e.setCancelled(true);
                Inventory inv = Bukkit.createInventory(p,54,"§7Sopas");
                for(int i=0;i<=inv.getSize()-1;i++){
                    inv.setItem(i, new ItemStack(Material.MUSHROOM_SOUP));
                }
                p.openInventory(inv);
            }
            if(sign.getLine(1).equalsIgnoreCase("§c[Recraft]")){
                Inventory inv = Bukkit.createInventory(p,54,"§7Recraft");
                int split = 1;
                for(int i=0;i<=inv.getSize()-1;i++){
                   if(split==1) inv.setItem(i, new ItemStack(Material.RED_MUSHROOM,64));
                   if(split==2) inv.setItem(i, new ItemStack(Material.BROWN_MUSHROOM,64));
                   if(split==3) inv.setItem(i, new ItemStack(Material.BOWL,64));
                   if(split>=3)split=1;
                   split++;
                }
                p.openInventory(inv);
                e.setCancelled(true);
            }
        }
    }

}
