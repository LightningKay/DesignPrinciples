package StructuralPatterns.DecoratorPatternForFoodApp;

public class PizzaWithOnion extends PizzaDecorator{

    Pizza pizza;

    public PizzaWithOnion(Pizza pizza){
        super(pizza);
        this.pizza = pizza;
    }


    @Override
    public double getCost() {
        System.out.println("Pizza with cheese cost is 30");
        return pizza.getCost() + 30D;
    }
}
