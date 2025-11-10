package CreationPatterns.BuilderPattern;

import java.util.*;
public class ConstructMeal {

    public static void main(String[] args) {
        BurgerMeal.BurgerMealBuilder burgerBuilder = MealFactory.getBurgerInstance("wheat", "veg");

        BurgerMeal burgerMeal = burgerBuilder.addToppings(Arrays.asList("Lettuce")).build();

        PizzaMeal.PizzaMealBuilder pizzaBuilder = MealFactory.getPizzaInstance("Wheat", "chicken");
        PizzaMeal pizzaMeal = pizzaBuilder.addToppings(Arrays.asList("onions")).hasCheese(true).build();

        MealService newMealService = new MealService();
        newMealService.serve(burgerMeal);
        newMealService.serve(pizzaMeal);
    }
}
