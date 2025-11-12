package StructuralPatterns.DecoraatorPatternForFoodApp;

public class PainBurger implements Burger, Food{
    @Override
    public double getCost() {
        System.out.println("Pain Burger cost is " + 10D);
        return 10;
    }
}
