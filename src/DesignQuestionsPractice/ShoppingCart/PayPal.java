package DesignQuestionsPractice.ShoppingCart;

public class PayPal implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment done through Paypal");
    }
}
