package DesignQuestionsPractice.ShoppingCart;

public interface Cart {

    boolean addItem(Item item);
    boolean deleteItem(Item item);

    boolean addItemByQuantity(Item item, int quant);

    ShoppingCartDTO getItems();
}
