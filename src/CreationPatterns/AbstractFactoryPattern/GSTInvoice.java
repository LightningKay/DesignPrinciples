package CreationPatterns.AbstractFactoryPattern;

public class GSTInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("Invoicing for GSTInvoice");
    }
}
