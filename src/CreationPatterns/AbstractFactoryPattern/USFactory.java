package CreationPatterns.AbstractFactoryPattern;

public class USFactory implements Country {
    public PaymentGateway getPaymentGateway(String type){
        if(type.equals("STRIPE")){
            return new Stripe();
        }else{
            return new Paypal();
        }
    }

    public Invoice getInvoice(String type){
       return new USInvoice();
    }
}
