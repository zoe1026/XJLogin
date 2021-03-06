package org.xjcraft.login.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import org.xjcraft.login.manager.impl.BungeeImpl;

public class CommandRegister extends Command {
    private BungeeImpl manager;

    public CommandRegister(String name, BungeeImpl manager) {
        super(name);
        this.manager = manager;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            if (((ProxiedPlayer) sender).getServer().getInfo().getName().equalsIgnoreCase("login"))
                manager.register((ProxiedPlayer) sender, args);
        }
    }
}
