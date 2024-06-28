package system_design.LLD.Coupons_on_ShoppingCart;

import java.util.HashSet;
import java.util.Set;

public class TypeCouponDecorator extends CouponsDecorator {

    Product product;
    int discountPercentage;
    ProductType productType;
    static Set<ProductType> eligibleTypes = new HashSet<>();

    static {
        eligibleTypes.add(ProductType.FURNITURE);
        eligibleTypes.add(ProductType.DECORATIVE);
    }

    public TypeCouponDecorator(Product product, int discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if (eligibleTypes.contains(productType)) {
            return price - (price * discountPercentage) / 100;
        }
        return price;
    }
}
