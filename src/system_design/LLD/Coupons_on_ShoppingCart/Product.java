package system_design.LLD.Coupons_on_ShoppingCart;

public abstract class Product {

    String name;
    ProductType type;
    double originalPrice;

    public Product() {
    }

    public Product(String name, double price, ProductType type) {
        this.name = name;
        this.originalPrice = price;
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public abstract double getPrice();

}
