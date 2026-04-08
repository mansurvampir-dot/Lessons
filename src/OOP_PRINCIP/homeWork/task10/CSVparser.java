package OOP_PRINCIP.homeWork.task10;

public class CSVparser implements FileParser{
    @Override
    public void parse(String content){
        System.out.println("Parsing SCV"+ content
        );
    }
    @Override
    public String getFormat(){
        return "CSV";
    }
}
