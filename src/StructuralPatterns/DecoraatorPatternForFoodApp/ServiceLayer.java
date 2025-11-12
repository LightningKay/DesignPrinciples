package StructuralPatterns.DecoraatorPatternForFoodApp;

import java.util.*;

public class ServiceLayer {
    public static void main(String[] args) {


        Burger burger = new PainBurger(); // 10
        Burger withCheese = new BurgerWithCheese(burger); // 10

        Burger burger2 = new PainBurger(); // 10
        Burger withOnions = new BurgerWithOnions(burger); // 20

        Pizza pizza = new PlainPizza(); // 30

        Pizza pizzaWithCheese = new PizzaWithCheese(pizza); // 20

        List<Food> foods = List.of(withCheese, withOnions, pizzaWithCheese);
        double total = 0;

        for(Food food : foods){
            total += food.getCost();
        }

        System.out.println(total);

    }
}
