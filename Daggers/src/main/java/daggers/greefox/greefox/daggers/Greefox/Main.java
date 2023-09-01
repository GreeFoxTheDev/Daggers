package daggers.greefox.greefox.daggers.Greefox;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DaggersListener(this), this);
        getServer().getPluginManager().registerEvents(new ResourcepackChecker(this), this);
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "******************************");
        console.sendMessage(ChatColor.AQUA + "| Daggers have been enabled! |");
        console.sendMessage(ChatColor.AQUA + "******************************");
        Daggers.init();
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.RED + "*******************************");
        console.sendMessage(ChatColor.RED + "| Daggers have been disabled! |");
        console.sendMessage(ChatColor.RED + "*******************************");
    }
}
