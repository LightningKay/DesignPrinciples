package CreationPatterns.AbstractFactoryPattern;

public class CSTInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("Invoicing for CST Invoice");
    }
}
