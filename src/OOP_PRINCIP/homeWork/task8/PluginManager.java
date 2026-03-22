package OOP_PRINCIP.homeWork.task8;

import java.util.ArrayList;
import java.util.List;

class PluginManager {
    private List<Plugin> plugins = new ArrayList<>();
    public void register(Plugin plugin) {
        plugins.add(plugin);
        System.out.println("Зарегистрирован плагин: " + plugin.getName() + " v" + plugin.getVersion());
    }
    public void listPlugins() {
        if (plugins.isEmpty()) {
            System.out.println("Нет зарегистрированных плагинов.");
            return;
        }
        System.out.println("Список установленных плагинов:");
        for (Plugin plugin : plugins) {
            System.out.println(" - " + plugin.getName() + " (версия: " + plugin.getVersion() + ")");
        }
    }
    public void executeAll() {
        if (plugins.isEmpty()) {
            System.out.println("Нет плагинов для выполнения.");
            return;
        }
        System.out.println("Запуск всех плагинов:");
        for (Plugin plugin : plugins) {
            plugin.execute();
        }
    }
}
