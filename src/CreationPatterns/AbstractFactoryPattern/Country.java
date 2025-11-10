package CreationPatterns.AbstractFactoryPattern;

public interface Country {
    PaymentGateway getPaymentGateway(String type);
    Invoice getInvoice(String type);
}
