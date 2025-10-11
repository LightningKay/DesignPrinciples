package StructuralPatterns;

import StructuralPatterns.Product1;
import StructuralPatterns.ProductBundle1;

import java.util.*;

class Product {


    private String name;
    private double price;

    public Product(String name, double price){
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

class ProductBundle {
    private String bundleName;
    private List<Product1> products;

    public ProductBundle(String bundleName){
        this.bundleName = bundleName;
        this.products = new ArrayList<>();
    }

    public double getPrice(){
        double cost = 0;
        for(Product1 product : products){
            cost += product.getPrice();
        }

        return cost;
    }

    public void display(){
        for(Product1 product : products){
            System.out.println("Product " + product.getName() + " price is " + product.getPrice());
        }
    }

    public void addProduct(Product1 product){
        this.products.add(product);
    }

}
public class WithoutCompositePattern {

    public static void main(String[] args) {
        Product1 book = new Product1("Book", 500);
        Product1 headphones = new Product1("Headphones", 1500);
        Product1 charger = new Product1("Charger", 800);
        Product1 pen = new Product1("Pen", 20);
        Product1 notebook = new Product1("Notebook", 60);

        // Bundle: Iphone Combo
        ProductBundle1 iphoneCombo = new ProductBundle1("iPhone Combo Pack");
        iphoneCombo.addProduct(headphones);
        iphoneCombo.addProduct(charger);

        // Bundle: School Kit
        ProductBundle1 schoolKit = new ProductBundle1("School Kit");
        schoolKit.addProduct(pen);
        schoolKit.addProduct(notebook);

        // Add to cart logic
        List<Object> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);
        double total = 0;

        for (Object product : cart) {
            if (product instanceof Product1) {
                Product1 prod = (Product1) product;
                total += prod.getPrice();
            } else if (product instanceof ProductBundle1) {
                ProductBundle1 bundle = (ProductBundle1) product;
                total += bundle.getPrice();
            }
        }

        System.out.println(total);
    }


}
