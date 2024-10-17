import java.util.List;

// Tax pricing strategy
public class TaxPricingStrategy implements PricingStrategy {
    private final double taxPercentage;

    public TaxPricingStrategy(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateTotal(List<Item> items) {
        double total = new RegularPricingStrategy().calculateTotal(items);
        return total + (total * (taxPercentage / 100));
    }
}
