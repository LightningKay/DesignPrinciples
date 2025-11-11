package DesignQuestionsPractice.ShoppingCart;

public class OrderService {

    Payment paymentGateway;
    Invoice invoice;
    public OrderService(Payment paymentGateway, Invoice invoice){
        this.paymentGateway = paymentGateway;
        this.invoice = invoice;
    }

    public OrderDTO generateOrder(){
        paymentGateway.processPayment();
        invoice.generateInvoice();

        return new OrderDTO(paymentGateway, invoice);
    }
}
