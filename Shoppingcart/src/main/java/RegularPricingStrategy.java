import java.util.List;

// Regular pricing strategy
public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
