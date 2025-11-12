package StructuralPatterns.DecoratorPatternForFoodApp;

public class BurgerWithCheese extends BurgerDecorator{

    Burger burger;
    public BurgerWithCheese(Burger burger){
        super(burger);
        this.burger = burger;
    }
    @Override
    public double getCost() {
        System.out.println("Buger with cheese");
        return burger.getCost() + 10D;
    }
}
