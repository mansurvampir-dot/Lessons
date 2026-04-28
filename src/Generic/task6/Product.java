package Generic.task6;

public class Product {
    private String name;
    private int price;
    private double raiting;

    Product(String name,int price,double raiting){
        this.name= name;
        this.price=price;
        this.raiting = raiting;

    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + "цена " + price + " рейтинг " + raiting;
    }
}
