package StructuralPatterns.DecoraatorPatternForFoodApp;

public class PizzaWithCheese extends PizzaDecorator{

    Pizza pizza;

    public PizzaWithCheese(Pizza pizza){
        super(pizza);
        this.pizza = pizza;
    }
    @Override
    public double getCost() {
        System.out.println("Pizza with cheese cost is 20");
        return pizza.getCost() + 20D;
    }
}
