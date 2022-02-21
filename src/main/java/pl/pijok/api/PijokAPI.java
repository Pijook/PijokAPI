package pl.pijok.api;

import org.bukkit.plugin.Plugin;

public class PijokAPI {

    private Plugin plugin;
    private Debugger debugger;
    private ConfigProvider configProvider;
    private ChatManager chatManager;

    public PijokAPI(Plugin plugin){
        this.plugin = plugin;
        this.debugger = new Debugger();
        this.configProvider = new ConfigProvider(this);
        this.chatManager = new ChatManager();
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(Plugin plugin) {
        this.plugin = plugin;
    }

    public Debugger getDebugger() {
        return debugger;
    }

    public void setDebugger(Debugger debugger) {
        this.debugger = debugger;
    }

    public ConfigProvider getConfigProvider() {
        return configProvider;
    }

    public void setConfigProvider(ConfigProvider configProvider) {
        this.configProvider = configProvider;
    }

    public ChatManager getChatManager() {
        return chatManager;
    }

    public void setChatManager(ChatManager chatManager) {
        this.chatManager = chatManager;
    }
}
