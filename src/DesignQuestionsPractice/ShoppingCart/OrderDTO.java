package DesignQuestionsPractice.ShoppingCart;

public class OrderDTO {

    Payment payment;
    Invoice invoice;

    public OrderDTO(Payment payment, Invoice invoice){
        this.invoice = invoice;
        this.payment = payment;
    }
}
