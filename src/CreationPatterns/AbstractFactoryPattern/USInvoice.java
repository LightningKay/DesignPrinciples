package CreationPatterns.AbstractFactoryPattern;

public class USInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("Invoicing for US");
    }
}
