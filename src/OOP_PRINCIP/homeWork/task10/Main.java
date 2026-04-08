package OOP_PRINCIP.homeWork.task10;

public class Main {
    public static void main(String[] args) {

        FileProcessor processor = new FileProcessor();

        processor.setParser(new CSVparser());
        processor.processFile("name,age");

        processor.setParser(new JSON());
        processor.processFile("{name: 'John'}");

        processor.setParser(new XML());
        processor.processFile("<name>John</name>");
    }
}