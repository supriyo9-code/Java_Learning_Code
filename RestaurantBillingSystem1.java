import java.util.*;

public class RestaurantBillingSystem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalAmount = 0.0;
        boolean orderMore = true;

        System.out.println("Welcome to the Multi-Cuisine Restaurant!");

        while (orderMore) {
            System.out.println("\nSelect a category:");
            System.out.println("1. Starters");
            System.out.println("2. Main Course");
            System.out.println("3. Desserts");

            int category = sc.nextInt();
            String categoryName = "";
            switch (category) {
                case 1:
                    categoryName = "Starters";
                    break;
                case 2:
                    categoryName = "Main Course";
                    break;
                case 3:
                    categoryName = "Desserts";
                    break;
                default:
                    System.out.println("Invalid selection!");
                    System.exit(0);
            }

            System.out.println("Do you want Veg or Non-Veg? (v/n)");
            String vegNonVeg = sc.next();
            if (!vegNonVeg.equalsIgnoreCase("v") && !vegNonVeg.equalsIgnoreCase("n")) {
                System.out.println("Invalid selection!");
                System.exit(0);
            }

            Map<String, Double> items = new HashMap<>();
            switch (category) {
                case 1:
                    items.put("Veg Starter 1", 150.0);
                    items.put("Veg Starter 2", 200.0);
                    items.put("Non-Veg Starter 1", 250.0);
                    items.put("Non-Veg Starter 2", 300.0);
                    break;
                case 2:
                    items.put("Veg Main Course 1", 250.0);
                    items.put("Veg Main Course 2", 300.0);
                    items.put("Non-Veg Main Course 1", 350.0);
                    items.put("Non-Veg Main Course 2", 400.0);
                    break;
                case 3:
                    items.put("Veg Dessert 1", 100.0);
                    items.put("Veg Dessert 2", 150.0);
                    items.put("Non-Veg Dessert 1", 200.0);
                    items.put("Non-Veg Dessert 2", 250.0);
                    break;
                default:
                    break;
            }

            System.out.println("Select an item to order:");
            for (Map.Entry<String, Double> entry : items.entrySet()) {
                String itemName = entry.getKey();
                double itemPrice = entry.getValue();
                if ((vegNonVeg.equalsIgnoreCase("v") && itemName.startsWith("Veg"))
                        || (vegNonVeg.equalsIgnoreCase("n") && itemName.startsWith("Non-Veg"))) {
                    System.out.println(itemName + " - " + itemPrice + " Rs.");
                }
            }

            System.out.println("Enter the item name to order:");
            String itemName = sc.next();
            if (!items.containsKey(itemName)) {
                System.out.println("Invalid selection!");
                System.exit(0);
            }

            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();
            totalAmount += items.get(itemName) * quantity;

            System.out.println("Do you want to order more (Yes/No)?");
            String orderMoreString = sc.next();
            if (!orderMoreString.equalsIgnoreCase("y") && !orderMoreString.equalsIgnoreCase("yes")) {
                orderMore = false;
            }
        }

        double gstAmount = 0.18 * totalAmount;
	}
}