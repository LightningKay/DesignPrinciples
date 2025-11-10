package CreationPatterns.BuilderPattern;

public class MealFactory {
    private MealFactory(){

    }
    public static BurgerMeal.BurgerMealBuilder getBurgerInstance(String buntype, String patty){
        return new BurgerMeal.BurgerMealBuilder(buntype, patty);
    }

    public static PizzaMeal.PizzaMealBuilder getPizzaInstance(String buntype, String patty){
        return new PizzaMeal.PizzaMealBuilder(buntype, patty);
    }
}
