package OOP_PRINCIP.homeWork.task10;

public class JSON implements FileParser{
    @Override
    public void parse(String content){
        System.out.println("Parsing JSON"+ content);
    }
    @Override
    public String getFormat(){
        return "JSON";
    }
}
