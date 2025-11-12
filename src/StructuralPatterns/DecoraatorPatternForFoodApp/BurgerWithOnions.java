package StructuralPatterns.DecoraatorPatternForFoodApp;

public class BurgerWithOnions extends BurgerDecorator{

    Burger burger;

    public BurgerWithOnions(Burger burger){
        super(burger);
        this.burger = burger;
    }

    @Override
    public double getCost() {
        return burger.getCost() + 20D;
    }
}
