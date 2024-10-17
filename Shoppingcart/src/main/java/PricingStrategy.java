import java.util.List;

// Interface for pricing strategy
public interface PricingStrategy {
    double calculateTotal(List<Item> items);
}
