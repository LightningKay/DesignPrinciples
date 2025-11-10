package CreationPatterns.AbstractFactoryPattern;

public class Paypal implements PaymentGateway{


    @Override
    public void processPayments(double amount) {
        System.out.println("Using Paypal - " + amount);
    }
}
