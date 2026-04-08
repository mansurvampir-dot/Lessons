package OOP_PRINCIP.homeWork.task13;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("");
    }
    public String getPaymentMethod(){
        return "Card";
    }
}
