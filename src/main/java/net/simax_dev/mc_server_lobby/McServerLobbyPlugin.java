package net.simax_dev.mc_server_lobby;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class McServerLobbyPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        Bukkit.getOnlinePlayers().forEach(player -> player.sendMessage(ChatColor.GREEN + "Und wie gehts :)"));
    }
}
