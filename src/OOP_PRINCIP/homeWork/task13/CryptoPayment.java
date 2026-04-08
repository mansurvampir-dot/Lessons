package OOP_PRINCIP.homeWork.task13;

public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("");

    }
    @Override
    public String getPaymentMethod(){
        return "Crypto";
    }
}
