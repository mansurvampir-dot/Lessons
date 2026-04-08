package OOP_PRINCIP.homeWork.task13;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(Item item){
        items.add(item);
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public double calculateTotal(){
        double total = 0;
        for (Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void checkout(){
        double total = calculateTotal();
        if (paymentStrategy == null){
            System.out.println("Способ оплаты не выбран!");
            return;
        }
        paymentStrategy.pay(total);
        System.out.println("покупка совершена");
        }
    }
