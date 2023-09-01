package daggers.greefox.greefox.daggers.Greefox;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ResourcepackChecker implements Listener {
    Main plugin;

    public ResourcepackChecker(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        if (!(Bukkit.getServer().getPluginManager().isPluginEnabled("EpicWeapons")) || (!(Bukkit.getServer().getPluginManager().isPluginEnabled("Copper Items")))){
            event.getPlayer().setResourcePack("https://cdn-raw.modrinth.com/data/TQ5na7TX/versions/tRLkpZCx/EpicWepons-BETA-0.11.zip");
        }
    }
}
