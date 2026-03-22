package OOP_PRINCIP.homeWork.task8;

class LoggerPlugin implements Plugin {
    @Override
    public String getName() {
        return "LoggerPlugin";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public void execute() {
        System.out.println("[LoggerPlugin] Логирование действий");
    }
}