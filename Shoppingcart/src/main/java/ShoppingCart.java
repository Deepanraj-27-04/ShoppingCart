import java.util.ArrayList;
import java.util.List;

// Shopping cart class
public class ShoppingCart {
    private final List<Item> items;
    private PricingStrategy pricingStrategy;

    public ShoppingCart(PricingStrategy pricingStrategy) {
        this.items = new ArrayList<>();
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        return pricingStrategy.calculateTotal(items);
    }

    public List<Item> getItems() {
        return items;
    }
}
