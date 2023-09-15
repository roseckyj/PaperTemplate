package cz.xrosecky.template;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Template extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        try {
            Objects.requireNonNull(this.getCommand("test")).setExecutor(new TestCommand(this));
        } catch (Exception e) {
            this.getLogger().severe(e.getMessage());
            this.setEnabled(false);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
