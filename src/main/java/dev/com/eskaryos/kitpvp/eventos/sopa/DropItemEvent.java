package dev.com.eskaryos.kitpvp.eventos.sopa;

import dev.com.eskaryos.kitpvp.Main;
import dev.com.eskaryos.kitpvp.eventos.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

public class DropItemEvent extends Listeners {

    @EventHandler
    public void Drop(PlayerDropItemEvent e){
        ItemStack item = e.getItemDrop().getItemStack();
        Material t = item.getType();
        if(t.equals(Material.MUSHROOM_SOUP)||t.equals(Material.RED_MUSHROOM)||t.equals(Material.BROWN_MUSHROOM)||
        t.equals(Material.BOWL)){
            Bukkit.getScheduler().runTaskLater(Main.plugin, new Runnable() {
                @Override
                public void run() {
                    if(e.getItemDrop()!=null){
                        e.getItemDrop().getLocation().getWorld().playEffect(e.getItemDrop().getLocation(), Effect.SMOKE,1);
                        e.getItemDrop().remove();
                    }
                }
            },20*2);
        }
    }

}
