package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReading {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Groceries.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] elements = line.split(","); // Split the line by comma and store in an array
                if (elements.length == 4) { // Check if the line has four elements
                    String id = elements[0]; // Store the ID in the 0th position
                    String itemName = elements[1]; // Store the item name in the 1st position
                    String quantity = elements[2]; // Store the quantity in the 2nd position
                    double price = Double.parseDouble(elements[3]); // Store the price in the 3rd position as a double

                    System.out.println("ID: " + id);
                    System.out.println("Item Name: " + itemName);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Price: " + price);
                } else {
                    System.out.println("Invalid line format");
                }
            }

            double totalPrice = 0; // Initialize the total price
            for (int i = 1; i <= 10; i++) { // Iterate through the items
                String quantityStr = "" + i; // Convert the index to a string
                while (quantityStr.length() < 3) { // Pad the quantity with zeros to make it three digits
                    quantityStr = "0" + quantityStr;
                }
                String priceStr = "" + (i * 0.75); // Calculate and format the price
                while (priceStr.length() < 3) { // Pad the price with zeros to make it three digits
                    priceStr = "0" + priceStr;
                }
                System.out.println(i + ": " + quantityStr + " x " + priceStr + " = " + (i * 0.75)); // Display the item details
                totalPrice += i * 0.75; // Accumulate the total price
            }
            System.out.println("Total Price: " + totalPrice); // Display the total price
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}