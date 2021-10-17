package dev.com.eskaryos.kitpvp.eventos.sopa;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SopaTomarEvento extends Listeners {

    @EventHandler
    public void Tomar(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(p.getItemInHand()==null)return;
        if(!p.getItemInHand().getType().equals(Material.MUSHROOM_SOUP))return;
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction()== Action.RIGHT_CLICK_BLOCK){
            e.setCancelled(true);
            double regen = 7;
            double health = p.getHealth();
            if(health>=20)return;
            p.setFoodLevel(20);
            p.setItemInHand(new ItemStack(Material.BOWL));
            if(health+regen>=20){
                p.setHealth(20);
                return;
            }
            p.setHealth(p.getHealth()+regen);
        }
    }

}
