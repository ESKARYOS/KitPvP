package dev.com.eskaryos.kitpvp.eventos.player;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;

public class PlacaBreakEvent extends Listeners {


    @EventHandler
    public void placa (BlockBreakEvent e){
        if(!e.getBlock().getType().equals(Material.WALL_SIGN))return;
        Sign sign = (Sign) e.getBlock().getState();
        if(e.getPlayer().getGameMode()== GameMode.CREATIVE)return;
        if(sign.getLine(1).equalsIgnoreCase("§c[Sopas]"))e.setCancelled(true);
        if(sign.getLine(1).equalsIgnoreCase("§c[Recraft]"))e.setCancelled(true);
    }

}
