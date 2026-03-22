package OOP_PRINCIP.homeWork.task8;

class AnalyticsPlugin implements Plugin {
    @Override
    public String getName() {
        return "AnalyticsPlugin";
    }

    @Override
    public String getVersion() {
        return "1.5.2";
    }

    @Override
    public void execute() {
        System.out.println("[AnalyticsPlugin] Сбор аналитики и статистики...");
    }
}