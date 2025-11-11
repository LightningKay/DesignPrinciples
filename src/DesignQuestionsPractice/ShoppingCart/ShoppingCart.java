package DesignQuestionsPractice.ShoppingCart;

import java.util.*;
public class ShoppingCart implements Cart{

    private HashMap<Item, Integer> itemQuantity;

    public ShoppingCart(){
        itemQuantity = new HashMap<>();
    }


    @Override
    public boolean addItem(Item item) {
        itemQuantity.put(item, 1);
        return true;
    }

    @Override
    public boolean deleteItem(Item item) {
        if(itemQuantity.containsKey(item)){
            itemQuantity.remove(item);
            return true;
        }
        return false;
    }

    @Override
    public boolean addItemByQuantity(Item item, int quant) {
        itemQuantity.put(item, quant);
        return true;
    }

    public ShoppingCartDTO getItems(){
        return new ShoppingCartDTO(itemQuantity);
    }
}
