package CreationPatterns.AbstractFactoryPattern;

public class Indiafactory implements Country {

    public PaymentGateway getPaymentGateway(String type){
        if(type.equals("RAZORPAY")){
            return new RazorPay();
        }else{
            return new PayU();
        }
    }

    public Invoice getInvoice(String type){
        if(type.equals("CST")){
            return new CSTInvoice();
        }else{
            return new GSTInvoice();
        }
    }
}
