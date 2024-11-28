
package com.mycompany.oop_finalproj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class OOP_FinalProj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Central menuCentral = new Central();
        // categories, we can add shi here and just add it to cases if so
        Category burger = new Category("BURGER");
        burger.addItem(new MenuItem("Classic Burger", 59.99));
        burger.addItem(new MenuItem("Cheeseburger", 69.99));
        burger.addItem(new MenuItem("TLC Burger", 89.99));
        burger.addItem(new MenuItem("Infamous Spicy Triple Beef Angus A5 Wagyu Burger", 999.99));
        burger.addItem(new MenuItem("1-inch Pizza Burger", 8.99));

        Category pasta = new Category("PASTA");
        pasta.addItem(new MenuItem("Spaghetti", 80.00));
        pasta.addItem(new MenuItem("Carbonara", 80));
        pasta.addItem(new MenuItem("Spaghetti Aglio e Olio", 220));
        pasta.addItem(new MenuItem("Cacio e Pepe", 260));
        pasta.addItem(new MenuItem("Fettuccine", 250));

        Category drinks = new Category("DRINKS");
        drinks.addItem(new CustomDrink("Water", 0.00, false));
        drinks.addItem(new CustomDrink("Coke", 20.00, false));
        drinks.addItem(new CustomDrink("Sprite", 20.00, false));
        drinks.addItem(new CustomDrink("Iced Tea", 20.00, false));
        drinks.addItem(new CustomDrink("Coffee", 30.00, true));

        Category chicken = new Category("CHICKEN");
        chicken.addItem(new MenuItem("Fried Chicken", 80.00));
        chicken.addItem(new MenuItem("Barbeque Chicken", 105.00));
        chicken.addItem(new MenuItem("Chicken Parmesan", 120.00));
        chicken.addItem(new MenuItem("Chicken Alfredo", 120.00));
        chicken.addItem(new MenuItem("Braised Chicken", 210));

        // smart genius way i did so i dont have to make this complex was that we just
        // restrict them from customizing their drink i think
        Category special = new Category("COMBO MEALS");
        special.addItem(new SpecialCombo("Student Meal - Classic Burger w/ Medium Fries and Coke", 80.00,
                new CustomDrink("Coke", 0.00, false)));
        special.addItem(new SpecialCombo("Classic Fast Food - Cheeseburger w/ Medium Fries and Sprite", 90.00,
                new CustomDrink("Sprite", 0.00, false)));
        special.addItem(new SpecialCombo("Chicken Meal - 1pc Fried Chicken w/ Coke", 105.00,
                new CustomDrink("Coke", 0.00, false)));

        menuCentral.addCategory(burger);
        menuCentral.addCategory(pasta);
        menuCentral.addCategory(drinks);
        menuCentral.addCategory(chicken);
        menuCentral.addCategory(special);

        boolean running = true;
        Order currentOrder = new Order();

        while (running) {
            System.out.println("\n===== LET ERIC COOK =====");
            System.out.println("1. View Menu by Category");
            System.out.println("2. View Current Order and Delete Items");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\n===== MENU =====\n");
                        ArrayList<Category> categories = menuCentral.getCategories();
                        for (int i = 0; i < categories.size(); i++) {
                            System.out.println((i + 1) + ". " + categories.get(i).getName());
                        }
                        System.out.print("\nSelect your choice: ");
                        int categoryChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (categoryChoice > 0 && categoryChoice <= categories.size()) {
                            Category selectedCategory = categories.get(categoryChoice - 1);
                            System.out.println("\n===== " + selectedCategory.getName() + " =====");
                            ArrayList<MenuItem> items = selectedCategory.getItems();
                            System.out.println("0. Go back to main menu");
                            for (int i = 0; i < items.size(); i++) {
                                System.out.println((i + 1) + ". " + items.get(i));
                            }

                            System.out.print("Enter item number to add to order: ");

                            int itemChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (itemChoice > 0 && itemChoice <= items.size()) {
                                MenuItem selectedItem = items.get(itemChoice - 1);

                                if (selectedItem instanceof CustomDrink) {
                                    CustomDrink drink = (CustomDrink) selectedItem;
                                    System.out.println("Customize your drink:");
                                    System.out.println("1. Add Ice (only for cold drinks)");
                                    System.out.println("2. Add Additional Sugar");
                                    System.out.println("3. No Customization");
                                    System.out.print("\nChoose an option: ");
                                    int customizationChoice = scanner.nextInt();
                                    scanner.nextLine(); // Consume newline

                                    switch (customizationChoice) {
                                        case 1:
                                            drink.addIce();
                                            break;
                                        case 2:
                                            drink.addAdditionalSugar();
                                            break;
                                        case 3:
                                            System.out.println("No customization applied.");
                                            break;
                                        default:
                                            System.out.println("Invalid choice. No customization applied.");
                                    }
                                }

                                currentOrder.addItem(items.get(itemChoice - 1));
                                System.out.println("Item added to your order.");

                            } else if (itemChoice == 0) {
                                System.out.println("Going back to main menu.");
                            } else {
                                System.out.println("Invalid item number.");
                            }
                        } else {
                            System.out.println("Invalid category number.");
                        }
                        break;

                    case 2:
                        System.out.println("\n===== CURRENT ORDER =====");
                        ArrayList<MenuItem> orderItems = currentOrder.getItems();
                        if (orderItems.isEmpty()) {
                            System.out.println("Your order is empty.");
                            break;
                        } else {
                            for (int i = 0; i < orderItems.size(); i++) {
                                System.out.println((i + 1) + ". " + orderItems.get(i));
                            }
                            System.out.println("Total: Php " + currentOrder.calculateTotal());
                        }
                        System.out.print("Would you like to remove an item from your order? (yes/no): ");
                        String removeItemChoice = scanner.nextLine();
                        if (removeItemChoice.equalsIgnoreCase("yes")) {
                            System.out.print("Enter item number to remove from order (or 0 to go back): ");
                            int removeChoice = scanner.nextInt();
                            scanner.nextLine();
                            if (removeChoice > 0 && removeChoice <= orderItems.size()) {
                                MenuItem removedItem = orderItems.remove(removeChoice - 1);
                                System.out.println("Removed: " + removedItem.getName() + " from your order.");
                            } else if (removeChoice == 0) {
                                System.out.println("Going back to main menu.");
                            } else {
                                System.out.println("Invalid choice! No item removed.");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("\n===== CHECKOUT =====");
                        ArrayList<MenuItem> checkoutItems = currentOrder.getItems();
                        if (checkoutItems.isEmpty()) {
                            System.out.println("Your order is empty. Nothing to checkout.");
                        } else {
                            for (int i = 0; i < checkoutItems.size(); i++) {
                                System.out.println((i + 1) + ". " + checkoutItems.get(i));
                            }
                            System.out.println("Total: Php " + currentOrder.calculateTotal());
                            System.out.print("Would you like to save a receipt? (yes/no): ");
                            String saveReceiptChoice = scanner.nextLine();

                            if (saveReceiptChoice.equalsIgnoreCase("yes")) {
                                currentOrder.saveReceipt();
                            }

                            System.out.println("Thank you for your order!");
                            currentOrder = new Order(); // Reset the order
                        }
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting the system. Have a great day!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the invalid input
            }
        }
        scanner.close();
    }
}
