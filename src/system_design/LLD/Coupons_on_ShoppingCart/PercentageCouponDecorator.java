package system_design.LLD.Coupons_on_ShoppingCart;

public class PercentageCouponDecorator extends CouponsDecorator {
    Product product;
    int discountPercentage;


    public PercentageCouponDecorator(Product product, int discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        return price - (price * discountPercentage) / 100;
    }
}
