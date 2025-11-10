package CreationPatterns.BuilderPattern;
import java.util.*;

public class BurgerMeal implements Meal{

    private String bunType;
    private String patty;

    private boolean hasCheese;

    private List<String> toppings;

    private BurgerMealBuilder builder;
    public BurgerMeal(BurgerMealBuilder builder){
        this.builder = builder;
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
    }

    @Override
    public void show(){
        System.out.println( this.builder.toString());
    }


    public static class BurgerMealBuilder{
        private String bunType;
        private String patty;
        private boolean hasCheese;
        private List<String> toppings;

        public BurgerMealBuilder(String bunType, String patty){
            this.patty = patty;
            this.bunType = bunType;
        }



        public BurgerMealBuilder hasCheese(boolean hasCheese){
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerMealBuilder addToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public BurgerMeal build(){
            return new BurgerMeal(this);
        }

        public String toString(){
           return this.bunType + " " + this.patty + " " + this.hasCheese + " " + this.toppings.toString();
        }
    }
}
