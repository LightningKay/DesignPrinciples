package CreationPatterns.AbstractFactoryPattern;

public class RazorPay implements PaymentGateway{
    @Override
    public void processPayments(double amount) {
        System.out.println("Using RazorPay " + amount);
    }
}
