import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        // Create items and their prices
        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Apple", 1.00);
        itemPrices.put("Banana", 0.50);
        itemPrices.put("Orange", 0.75);

        // Create a shopping cart with regular pricing
        ShoppingCart cart = new ShoppingCart(new RegularPricingStrategy());

        Scanner scanner = new Scanner(System.in);
        String itemName;
        int quantity;

        System.out.println("Welcome to the Shopping Cart System!");
        System.out.println("Available items: " + itemPrices.keySet());
        System.out.println("Type 'exit' to finish adding items.");

        // Loop to accept user input until 'exit' is typed
        while (true) {
            System.out.print("Enter item name: ");
            itemName = scanner.nextLine();

            // Exit condition
            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }

            // Check if the item exists
            if (!itemPrices.containsKey(itemName)) {
                System.out.println("Item not available. Please choose from the available items.");
                continue;
            }

            // Get quantity from user
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            // Add items to the cart (price multiplied by quantity)
            double itemPrice = itemPrices.get(itemName);
            for (int i = 0; i < quantity; i++) {
                cart.addItem(new Item(itemName, itemPrice));
            }

            System.out.println(quantity + " " + itemName + "(s) added to cart.");
        }

        // Calculate total price with regular pricing
        System.out.println("Total with regular pricing: $" + cart.calculateTotal());

        // Change pricing strategy to discount
        cart.setPricingStrategy(new DiscountPricingStrategy(10)); // 10% discount
        System.out.println("Total with discount pricing: $" + cart.calculateTotal());

        // Change pricing strategy to tax
        cart.setPricingStrategy(new TaxPricingStrategy(5)); // 5% tax
        System.out.println("Total with tax pricing: $" + cart.calculateTotal());

        scanner.close();
    }
}
