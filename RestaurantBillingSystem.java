import java.util.Scanner;

public class RestaurantBillingSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Initialize the menu items with their prices
        String[][] menu = {
            {"Veg Starters", "100"},
            {"Non-veg Starters", "150"},
            {"Veg Main Course", "200"},
            {"Non-veg Main Course", "250"},
            {"Desserts", "100"}
        };
        
        // Print the main menu
        System.out.println("Welcome to the Multi-cuisine Restaurant");
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i][0] + " - Rs. " + menu[i][1]);
        }
        
        // Take input for the selected menu item
        System.out.print("Enter the option you want to order (1-" + menu.length + "): ");
        int selectedItem = input.nextInt() - 1;
        
        // Take input for veg or non-veg
        System.out.print("Do you want Veg or Non-veg? ");
        String vegOrNonVeg = input.next();
        
        // Initialize the list of items based on the selected category
        String[][] itemList = null;
        if (vegOrNonVeg.equalsIgnoreCase("veg")) {
            if (selectedItem == 0) {
                itemList = new String[][] {
                    {"Veg Manchurian", "120"},
                    {"Veg Spring Rolls", "80"},
                    {"Veg Seekh Kebab", "100"}
                };
            } else if (selectedItem == 2) {
                itemList = new String[][] {
                    {"Veg Biryani", "180"},
                    {"Paneer Butter Masala", "200"},
                    {"Aloo Gobi", "150"}
                };
            } else if (selectedItem == 4) {
                itemList = new String[][] {
                    {"Gulab Jamun", "80"},
                    {"Ras Malai", "90"},
                    {"Kheer", "70"}
                };
            }
        } else if (vegOrNonVeg.equalsIgnoreCase("non-veg")) {
            if (selectedItem == 1) {
                itemList = new String[][] {
                    {"Chicken Tikka", "180"},
                    {"Fish Fry", "200"},
                    {"Mutton Sheekh Kebab", "250"}
                };
            } else if (selectedItem == 3) {
                itemList = new String[][] {
                    {"Chicken Biryani", "220"},
                    {"Butter Chicken", "250"},
                    {"Mutton Rogan Josh", "280"}
                };
            }
        }
        
        // If no items are available for the selected category, terminate the program
        if (itemList == null) {
            System.out.println("No items available for the selected category.");
            System.exit(0);
        }
        
        // Print the list of items for the selected category
        System.out.println("Menu:");
        for (int i = 0; i < itemList.length; i++) {
            System.out.println((i+1) + ". " + itemList[i][0] + " - Rs. " + itemList[i][1]);
        }
        
        // Take input for the selected item and the quantity
        System.out.print("Enter the item you want to order (1-" + itemList.length + "): ");
        int selectedItemIndex = input.nextInt
