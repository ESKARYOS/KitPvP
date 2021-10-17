package dev.com.eskaryos.kitpvp.eventos.player;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import dev.com.eskaryos.kitpvp.utils.JavaUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class EntrarServidorEvento extends Listeners {


    @EventHandler
    public void entrar(PlayerJoinEvent e){
        e.setJoinMessage(null);
        Player p = e.getPlayer();
        JavaUtils.getItemsLobby(p);
    }

}
