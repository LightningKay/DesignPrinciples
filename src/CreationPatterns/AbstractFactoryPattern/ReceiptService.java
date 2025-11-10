package CreationPatterns.AbstractFactoryPattern;

public class ReceiptService {

    public static void main(String[] args) {
        Country indiaCountry = CountryFactory.getInstance("INDIA");

        PaymentGateway paymentGateway = indiaCountry.getPaymentGateway("RAZORPAY");
        Invoice invoice = indiaCountry.getInvoice("CST");

        paymentGateway.processPayments(100.00);
        invoice.generateInvoice();

        Country UsCountry = CountryFactory.getInstance("US");

        PaymentGateway paymentGateway1 = UsCountry.getPaymentGateway("PAYPAL");
        Invoice invoice1 = UsCountry.getInvoice("CST");

        paymentGateway1.processPayments(100.00);
        invoice1.generateInvoice();

    }
}
