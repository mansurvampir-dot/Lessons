package OOP_PRINCIP.homeWork.task8;

class BackupPlugin implements Plugin {
    @Override
    public String getName() {
        return "BackupPlugin";
    }

    @Override
    public String getVersion() {
        return "2.1.0";
    }

    @Override
    public void execute() {
        System.out.println("[BackupPlugin] Создание резервной копии данных...");
    }
}
