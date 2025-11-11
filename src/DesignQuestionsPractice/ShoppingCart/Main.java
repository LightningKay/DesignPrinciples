package DesignQuestionsPractice.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(123, 20);
        Item item2 = new Item(1234, 30);

        Cart shoppingCart = new ShoppingCart();
        shoppingCart.addItemByQuantity(item1, 2);
        shoppingCart.addItemByQuantity(item2, 3);

        ShoppingCartDTO items = shoppingCart.getItems();
        PromoCode code = new Discount10();
        Checkout checkout = new ShoppingCheckout.Builder(items).addPromoCode(code).build();

        System.out.println(checkout.calculateTotal());

        OrderService orderService = new OrderService(new Stripe(), new USInvoice());

    }
}
