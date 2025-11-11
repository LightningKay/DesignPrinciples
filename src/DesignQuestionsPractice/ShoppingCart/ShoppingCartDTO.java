package DesignQuestionsPractice.ShoppingCart;

import java.util.*;
public class ShoppingCartDTO {

    HashMap<Item, Integer> items;

    public ShoppingCartDTO(HashMap<Item, Integer> items){
        this.items = items;
    }
}
