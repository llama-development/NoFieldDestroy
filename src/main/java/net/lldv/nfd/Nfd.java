package net.lldv.nfd;

import cn.nukkit.block.BlockID;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.plugin.PluginBase;

public class Nfd extends PluginBase implements Listener {

    public static Nfd instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onField(PlayerInteractEvent event) {
        if (event.getAction() == PlayerInteractEvent.Action.PHYSICAL) {
            if (event.getBlock().getId() == BlockID.FARMLAND) {
                event.setCancelled();
            }
        }
    }

}
