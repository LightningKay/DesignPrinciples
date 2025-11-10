package CreationPatterns.AbstractFactoryPattern;

public class Stripe implements PaymentGateway{

    @Override
    public void processPayments(double amount) {
        System.out.println("using stripe - " + amount);
    }
}
