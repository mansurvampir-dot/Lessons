package OOP_PRINCIP.homeWork.task8;

public class Main {
    public static void main(String[] args) {
        PluginManager manager = new PluginManager();
        Plugin logger = new LoggerPlugin();
        Plugin backup = new BackupPlugin();
        Plugin analytics = new AnalyticsPlugin();
        manager.register(logger);
        manager.register(backup);
        manager.register(analytics);
        manager.listPlugins();
        manager.executeAll();
    }
}
