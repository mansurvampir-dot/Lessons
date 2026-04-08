package OOP_PRINCIP.homeWork.task13;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("");
    }
    @Override
    public String getPaymentMethod(){
        return "PayPal";
    }
}
