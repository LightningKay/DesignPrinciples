package StructuralPatterns.DecoraatorPatternForFoodApp;

public class PlainPizza implements Pizza{


    @Override
    public double getCost() {
        System.out.println("Pizza with cheese cost is 30");
        return 30;
    }
}
