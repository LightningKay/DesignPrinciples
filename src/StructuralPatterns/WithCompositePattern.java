package StructuralPatterns;
import java.util.*;


interface CartItem{
    public double getPrice();
    public void display();
}
class Product1 implements CartItem{


    private String name;
    private double price;

    public Product1(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Product " + name + " price is " + this.price);
    }
}

class ProductBundle1 implements CartItem{
    private String bundleName;
    private List<CartItem> products;

    public ProductBundle1(String bundleName){
        this.bundleName = bundleName;
        this.products = new ArrayList<>();
    }

    public double getPrice(){
        double cost = 0;
        for(CartItem product : products){
            cost += product.getPrice();
        }

        return cost;
    }

    public void display(){
        for(CartItem product : products){
            System.out.println("Product " + bundleName + " price is " + product.getPrice());
        }
    }

    public void addProduct(CartItem product){
        this.products.add(product);
    }

}
public class WithCompositePattern {
    public static void main(String[] args) {
        CartItem book = new Product1("Atomic Habits", 499);
        CartItem phone = new Product1("iPhone 15", 79999);
        CartItem earbuds = new Product1("AirPods", 15999);
        CartItem charger = new Product1("20W Charger", 1999);

        // Combo Deal
        ProductBundle1 iphoneCombo = new ProductBundle1("iPhone Essentials Combo");
        iphoneCombo.addProduct(phone);
        iphoneCombo.addProduct(earbuds);
        iphoneCombo.addProduct(charger);

        // Back to School Kit
        ProductBundle1 schoolKit = new ProductBundle1("Back to School Kit");
        schoolKit.addProduct(new Product1("Notebook Pack", 249));
        schoolKit.addProduct(new Product1("Pen Set", 99));
        schoolKit.addProduct(new Product1("Highlighter", 149));

        // Add everything to cart
        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        // Display cart
        System.out.println("Your Amazon Cart:");
        double total = 0;
        for (CartItem item : cart) {
            item.display();
            total += item.getPrice();
        }

        System.out.println("\nTotal: ₹" + total);
    }
}
