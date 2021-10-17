package dev.com.eskaryos.kitpvp.eventos.player;

import dev.com.eskaryos.kitpvp.Main;
import dev.com.eskaryos.kitpvp.eventos.Listeners;
import dev.com.eskaryos.kitpvp.menus.KitSelector;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MenuEventos extends Listeners {

    @EventHandler
    public void MenuEventos(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(p.getItemInHand()==null)return;
        if(!p.getItemInHand().hasItemMeta())return;
        if(!p.getItemInHand().getItemMeta().hasDisplayName())return;
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction()== Action.RIGHT_CLICK_BLOCK){
            switch (p.getItemInHand().getItemMeta().getDisplayName()){
                case "§a{Seletor de Kits}":
                    KitSelector.openKits(p);
                    e.setCancelled(true);
                    break;
                case "§a{Click test}":
                    e.setCancelled(true);
                    if(ClickTestEvent.listPlayer.contains(p))return;
                    p.sendMessage("§aComeçou");
                    ClickTestEvent.listPlayer.add(p);
                    ClickTestEvent.countClicks.put(p,0);
                    Bukkit.getScheduler().runTaskLater(Main.plugin, new Runnable() {
                        @Override
                        public void run() {
                            ClickTestEvent.listPlayer.remove(p);
                            p.sendMessage("§aVocê fez " + ClickTestEvent.countClicks.get(p)/10 + " CPS");
                            ClickTestEvent.countClicks.remove(p);
                        }
                    },20*10);
                    break;
            }
        }
    }

}
