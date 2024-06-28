package system_design.LLD.Coupons_on_ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("FAN", 1000, ProductType.ELECTRONIC);
        Product item2 = new Item2("SOFA", 2000, ProductType.FURNITURE);


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(item1);
        shoppingCart.addToCart(item2);

        System.out.println(shoppingCart.getTotalPrice());
    }
}
