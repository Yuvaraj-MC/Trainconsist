package org.example;

/**
 * =========================================================
 * MAIN CLASS – UseCase14TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents invalid passenger bogies from being
 * created by enforcing capacity rules using a custom
 * checked exception (InvalidCapacityException).
 * =========================================================
 */
public class TrainApp {

    // Custom exception class for invalid capacity
    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Inner Bogie class with capacity validation
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Invalid capacity for " + name + ": " + capacity);
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("===============================================\n");

        // Try creating a valid bogie
        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1.name + " -> " + b1.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try creating an invalid bogie (capacity <= 0)
        try {
            Bogie b2 = new Bogie("BrokenBogie", -5);
            System.out.println("Created: " + b2.name + " -> " + b2.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nUC14 exception handling completed...");
    }
}