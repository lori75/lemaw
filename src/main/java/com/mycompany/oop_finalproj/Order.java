package com.mycompany.oop_finalproj;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//user input storage
public class Order {
    private static ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public static double calculateTotal() {
        double total = 0.0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
    public void removeItem(int index){  
        if (index >= 0 && index < items.size());
        items.remove(index - 1);
    }
    public void removeItem(String index){  
        int strToInt = Integer.parseInt(index);
        items.remove(strToInt - 1);
    }
    
    public int getitemSize(){   
        return items.size();
    }

    /*
     * desecrated code
     * public String toString(){
     * String order = "";
     * for (MenuItem item : items){
     * order += item + "\n";
     * }
     * return order;
     * }
     */
    
    public String viewCart(){   
        StringBuilder receipt = new StringBuilder();
        receipt.append("*****************************************************************\n");
        receipt.append("*                        FOOD ITEMS ORDERED                           *\n");
        receipt.append("*****************************************************************\n");
        receipt.append("Date: ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).append("\n");
        receipt.append("-----------------------------------------------------------------\n");
        receipt.append("Items:\n");
        for (MenuItem item : items) {
            receipt.append(String.format("| %-49s Php %7.2f |\n", item.getName(), item.getPrice()));
        }
        receipt.append("-----------------------------------------------------------------\n");
        receipt.append(String.format("| %-49s Php %7.2f |\n", "Total:", calculateTotal()));
        return receipt.toString();
    }
    public String makeReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("*****************************************************************\n");
        receipt.append("*                          \tOFFICIAL RECEIPT                            *\n");
        receipt.append("*****************************************************************\n");
        receipt.append("Date: ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).append("\n");
        receipt.append("-----------------------------------------------------------------\n");
        receipt.append("Items:\n");
        for (MenuItem item : items) {
            receipt.append(String.format("| %-49s Php %7.2f |\n", item.getName(), item.getPrice()));
        }
        receipt.append("-----------------------------------------------------------------\n");
        receipt.append(String.format("| %-49s Php %7.2f |\n", "Total:", calculateTotal()));
        receipt.append("*****************************************************************\n");
        receipt.append("*                  THANK YOU FOR YOUR PURCHASE                  *\n");
        receipt.append("*****************************************************************\n");
        return receipt.toString();
    }
    public void saveReceipt() {
        if (items.isEmpty()) {
            System.out.println("No items in cart.");
            return;
        }

        // file handling, can find it in the package folder idk
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "receipt_" + timestamp + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("*****************************************************************\n");
            writer.write("*                            RECEIPT                            *\n");
            writer.write("*****************************************************************\n");
            writer.write("\n");

            // save date and time to receipt
            writer.write("Date: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\n");
            writer.write("-----------------------------------------------------------------\n");
            writer.write("Items:\n");

            // list of orders in receipt
            for (MenuItem item : items) {
                writer.write(String.format("| %-49s Php %7.2f |\n", item.getName(), item.getPrice()));
            }

            writer.write("-----------------------------------------------------------------\n");

            // Total
            writer.write(String.format("| %-49s Php %7.2f |\n", "Total:", calculateTotal()));

            writer.write("*****************************************************************\n");
            writer.write("*                  THANK YOU FOR YOUR PURCHASE                  *\n");
            writer.write("*****************************************************************\n");

            System.out.println("Receipt saved as " + fileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}