package pl.pijok.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatManager {

    private String prefix;

    public void setPrefix(String a){
        prefix = a;
    }

    /**
     * Changes & to minecraft colors
     * @param message Message to fix
     * @return Returns ready message
     */
    public String fixColor(String message){
        message = ChatColor.translateAlternateColorCodes('&', message);
        return message;
    }

    /**
     * Sends colored message to online Players
     * @param message Message to send
     */
    public void broadcast(String message){
        for(Player player : Bukkit.getOnlinePlayers()){
            sendMessage(player, message);
        }
    }

    /**
     * Sends colored message to Player
     * @param player Player that receives message
     * @param message Message to send
     */
    public void sendMessage(Player player, String message){
        player.sendMessage(fixColor(prefix + message));
    }

    /**
     * Sends colored message to CommandSender
     * @param player CommandSender that receives message
     * @param message Message to send
     */
    public void sendMessage(CommandSender player, String message){
        player.sendMessage(fixColor(prefix + message));
    }


}
