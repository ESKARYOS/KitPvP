package dev.com.eskaryos.kitpvp.eventos.player;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.SignChangeEvent;

public class PlacaPlaceEvent extends Listeners {


    @EventHandler
    public void placa (SignChangeEvent e){
        Player p = e.getPlayer();
        if(e.getLine(0).equalsIgnoreCase("[sopa]")){
            e.setLine(0,"§6-------------");
            e.setLine(1,"§c[Sopas]");
            e.setLine(2,"§6-------------");
            p.sendMessage("§aPlaca de sopas adicionada.");
        }
        if(e.getLine(0).equalsIgnoreCase("[recraft]")){
            e.setLine(0,"§6-------------");
            e.setLine(1,"§c[Recraft]");
            e.setLine(2,"§6-------------");
            p.sendMessage("§aPlaca de recraft adicionada.");
        }
    }

}
