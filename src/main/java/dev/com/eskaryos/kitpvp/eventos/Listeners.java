package dev.com.eskaryos.kitpvp.eventos;

import dev.com.eskaryos.kitpvp.Main;
import dev.com.eskaryos.kitpvp.eventos.player.*;
import dev.com.eskaryos.kitpvp.eventos.sopa.DropItemEvent;
import dev.com.eskaryos.kitpvp.eventos.sopa.PickupDropEvent;
import dev.com.eskaryos.kitpvp.eventos.sopa.SopaTomarEvento;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class Listeners implements Listener {

    public static void Setup(){
        Main pl = Main.plugin;
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new SopaTomarEvento(),pl);
        pm.registerEvents(new PickupDropEvent(),pl);
        pm.registerEvents(new DropItemEvent(),pl);
        pm.registerEvents(new EntrarServidorEvento(),pl);
        pm.registerEvents(new MenuEventos(),pl);
        pm.registerEvents(new ClickTestEvent(),pl);
        pm.registerEvents(new PlacaPlaceEvent(),pl);
        pm.registerEvents(new PlacaInteractEvent(),pl);
        pm.registerEvents(new PlacaBreakEvent(),pl);
    }

}
