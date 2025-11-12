package StructuralPatterns.DecoraatorPatternForFoodApp;

public abstract class BurgerDecorator implements Burger{

    private Burger burger;

    public BurgerDecorator(Burger burger){
        this.burger = burger;
    }
}
