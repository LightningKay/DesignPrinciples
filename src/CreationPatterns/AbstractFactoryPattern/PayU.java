package CreationPatterns.AbstractFactoryPattern;

public class PayU implements PaymentGateway{
    @Override
    public void processPayments(double amount) {
        System.out.println("using PayU " + amount);
    }
}
