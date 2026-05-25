// Question 2 - Arrays and Loops
// Topic: Inventory Tracker
//
// Task 1:
// An ArrayList called inventory has been declared for you below.
//
// Task 2:
// Write a method called addItem(itemName) that adds the given item to the
// inventory list. If the item already exists, print a message instead of adding it.
// Example message: "Mouse is already in inventory."
//
// Task 3:
// Write a method called listInventory() that prints all items in the inventory.
// If the inventory is empty, print: "Inventory is empty."

import java.util.ArrayList;

public class Q2_java {

    static ArrayList<String> inventory = new ArrayList<>();

    public void addItem(String itemName) {
        if (inventory.contains(itemName)) {
            System.out.println(itemName + " is already in inventory.");
        } else {
            inventory.add(itemName);
            System.out.println(itemName + " added to inventory.");
        }
    }

    public static void listInventory() {
        // Add your code here
        

    	if (inventory.isEmpty()) {
        	System.out.println("Inventory is empty.");
    	} else {
        	System.out.println("Inventory: " + inventory);
    	}

    }

    public static void main(String[] args) {
         Q2_java manager = new Q2_java();
        // Task 4: Call the methods in this order and observe the output:
       // addItem("Laptop");
       // addItem("Mouse");
       // addItem("Keyboard");
       // addItem("Mouse");   // Should trigger duplicate warning
       // listInventory();

        // Expected output:
        // Mouse is already in inventory.
        // Inventory: [Laptop, Mouse, Keyboard]

        manager.addItem("Laptop");
        manager.addItem("Mouse");
        manager.addItem("Keyboard");
        manager.addItem("Mouse");   // Should trigger duplicate warning
        manager.listInventory();
        
    }
}
