import java.util.List;

// Discount pricing strategy
public class DiscountPricingStrategy implements PricingStrategy {
    private final double discountPercentage;

    public DiscountPricingStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotal(List<Item> items) {
        double total = new RegularPricingStrategy().calculateTotal(items);
        return total - (total * (discountPercentage / 100));
    }
}
