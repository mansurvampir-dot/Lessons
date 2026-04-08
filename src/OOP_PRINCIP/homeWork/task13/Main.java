package OOP_PRINCIP.homeWork.task13;

public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Машина", 2000));
        cart.addItem(new Item("принтер", 1600));
        cart.addItem(new Item("мышь", 1600));
        cart.setPaymentStrategy(new CardPayment());
        cart.checkout();

    }
}
