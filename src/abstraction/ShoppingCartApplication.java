package abstraction;

import java.util.ArrayList;
import java.util.Scanner;

// Define an interface for a shopping cart
interface ShoppingCart {
    void addItem(String item, double price);
    void removeItem(String item);
    void viewCart();
    double calculateTotal();
}

// Implementation of the ShoppingCart interface
class OnlineShoppingCart implements ShoppingCart {
    private ArrayList<String> items; // List to store item names
    private ArrayList<Double> prices; // List to store item prices

    // Constructor to initialize the shopping cart
    public OnlineShoppingCart() {
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    // Add an item to the cart
    @Override
    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
        System.out.println(item + " added to the cart at price " + price);
    }

    // Remove an item from the cart
    @Override
    public void removeItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
            System.out.println(item + " removed from the cart.");
        } else {
            System.out.println("Item not found in the cart!");
        }
    }

    // View all items in the cart
    @Override
    public void viewCart() {
        System.out.println("\nItems in your cart:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i) + " - $" + prices.get(i));
        }
        System.out.println("Total: $" + calculateTotal());
    }

    // Calculate the total cost of items in the cart
    @Override
    public double calculateTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}

// Main class to demonstrate the ShoppingCart interface
public class ShoppingCartApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new OnlineShoppingCart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    cart.addItem(item, price);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine();
                    cart.removeItem(itemToRemove);
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    System.out.println("Thank you for shopping with us!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
