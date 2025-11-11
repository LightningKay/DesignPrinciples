package DesignQuestionsPractice.ShoppingCart;

public class Stripe implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment done through Stripe");
    }
}
