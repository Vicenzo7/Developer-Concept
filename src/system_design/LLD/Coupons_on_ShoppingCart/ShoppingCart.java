package system_design.LLD.Coupons_on_ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount = new TypeCouponDecorator(
                new PercentageCouponDecorator(product, 10),
                3,
                product.getType());
        productList.add(productWithEligibleDiscount);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }

        return sum;
    }
}
