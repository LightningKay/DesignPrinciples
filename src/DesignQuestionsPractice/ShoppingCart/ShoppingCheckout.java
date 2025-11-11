package DesignQuestionsPractice.ShoppingCart;

import java.util.*;
public class ShoppingCheckout implements Checkout {

    ShoppingCartDTO shoppingCart;

    PromoCode code;

    public ShoppingCheckout(Builder builder){
        this.shoppingCart = builder.shoppingCartDTO;
        this.code = builder.code;
    }

    public double calculateTotal(){
        HashMap<Item, Integer> itemQuantity = this.shoppingCart.items;
        double total = 0;
        for(Item key : itemQuantity.keySet()){
            total += key.price * itemQuantity.get(key);
        }

        if(this.code != null){
            total = total - (total * code.getDiscount());
        }

        return total;
    }

    static class Builder{
        ShoppingCartDTO shoppingCartDTO;
        PromoCode code;

        public Builder(ShoppingCartDTO shoppingCartDTO){
            this.shoppingCartDTO = shoppingCartDTO;
        }

        public Builder addPromoCode(PromoCode code){
            this.code = code;
            return this;
        }

        public ShoppingCheckout build(){
            return new ShoppingCheckout(this);
        }
    }
}
