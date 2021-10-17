package dev.com.eskaryos.kitpvp.eventos.sopa;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PickupDropEvent extends Listeners {

    @EventHandler
    public void event(PlayerPickupItemEvent e){
        ItemStack item = e.getItem().getItemStack();
        Material t = item.getType();
        if(t.equals(Material.BOWL)){
            e.setCancelled(true);
        }
    }
}
