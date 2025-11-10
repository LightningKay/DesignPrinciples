package CreationPatterns.BuilderPattern;

import java.util.List;

public class PizzaMeal implements Meal {

    private String bunType;
    private String patty;

    private boolean hasCheese;

    private List<String> toppings;

    private PizzaMealBuilder builder;

    public PizzaMeal(PizzaMealBuilder builder) {
        this.builder = builder;
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
    }

    @Override
    public void show() {
        System.out.println(this.builder.toString());
    }


    public static class PizzaMealBuilder {
        private String bunType;
        private String patty;
        private boolean hasCheese;
        private List<String> toppings;

        public PizzaMealBuilder(String bunType, String patty) {
            this.bunType = bunType;
            this.patty = patty;
        }

        public PizzaMealBuilder hasCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public PizzaMealBuilder addToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaMeal build() {

            return new PizzaMeal(this);
        }

        public String toString() {
            return this.bunType + " " + this.patty + " " + this.hasCheese + " " + this.toppings.toString();
        }
    }
}
