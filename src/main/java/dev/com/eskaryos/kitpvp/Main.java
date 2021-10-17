package dev.com.eskaryos.kitpvp;

import dev.com.eskaryos.kitpvp.eventos.Listeners;
import dev.com.eskaryos.kitpvp.utils.CustomRecipes;
import dev.com.eskaryos.kitpvp.utils.JavaUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Listeners.Setup();
        CustomRecipes.SopaCraft();
        getServer().getOnlinePlayers().forEach(JavaUtils::getItemsLobby);
    }

    @Override
    public void onDisable() {
    }

}
