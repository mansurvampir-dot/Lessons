package OOP_PRINCIP.homeWork.task10;

public class FileProcessor {

    private FileParser parser;

    public void setParser(FileParser parser) {
        this.parser = parser;
    }

    public void processFile(String content) {

        if (parser == null) {
            System.out.println("Parser не выбран");
            return;
        }

        parser.parse(content);
    }
}
