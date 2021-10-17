package dev.com.eskaryos.kitpvp.eventos.player;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.HashMap;

public class ClickTestEvent extends Listeners {

    public static ArrayList<Player> listPlayer = new ArrayList<>();
    public static HashMap<Player,Integer> countClicks = new HashMap<>();

    @EventHandler
    public void Clicar(PlayerInteractEvent e){

        if(e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK){
            if(listPlayer.contains(e.getPlayer())){
                e.setCancelled(true);
                final int click = countClicks.get(e.getPlayer());
                countClicks.put(e.getPlayer(),click+1);
            }
        }
    }

}
