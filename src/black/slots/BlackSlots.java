package black.slots;

import org.bukkit.Bukkit;
import org.bukkit.event.*;
import org.bukkit.event.Listener;
import org.bukkit.event.server.*;
import org.bukkit.plugin.java.*;

public class BlackSlots extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void slots(ServerListPingEvent event) {
        event.setMaxPlayers(getConfig().getInt("configuracoes.players"));
    }
}