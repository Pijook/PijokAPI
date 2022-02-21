package pl.pijok.api;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

public class Debugger {

    private final ConsoleCommandSender console = Bukkit.getConsoleSender();
    private String prefix = "[]";

    public void setPrefix(String a){
        prefix = a;
    }

    /**
     * Sends string to console
     * @param a Message to send
     */
    public void log(String a) {
        a = prefix + a;
        console.sendMessage(a.replace("&", "§"));
    }

    /**
     * Sends red error to console
     * @param a Error to send
     */
    public void sendError(String a){
        log("&c============");
        log("&c" + a);
        log("&c============");
    }

    /**
     * Sends object to console
     * @param a Object to send
     */
    public void log(Object a) {
        a = prefix + a;
        console.sendMessage(String.valueOf(a).replace("&", "§"));
    }


}
