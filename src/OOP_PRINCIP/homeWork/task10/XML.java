package OOP_PRINCIP.homeWork.task10;

public class XML implements FileParser{
    @Override
    public void parse(String content){
        System.out.println("Parsing XML" + content);
    }
    @Override
    public String getFormat(){
        return "XML";
    }
}
