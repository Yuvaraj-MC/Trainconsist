package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase20TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class prevents searching on an empty train by
 * throwing an IllegalStateException early (fail-fast).
 * =========================================================
 */
public class TrainApp {

    // Method that searches, but validates state first
    static boolean searchBogie(List<String> bogies, String searchKey) {
        // Defensive check: fail-fast if the train is empty
        if (bogies.isEmpty()) {
            throw new IllegalStateException(
                    "Cannot search: the train has no bogies. Add bogies first.");
        }

        // Normal linear search (only runs if not empty)
        for (String id : bogies) {
            if (id.equals(searchKey)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("===============================================\n");

        // Case 1: Search on an EMPTY train
        List<String> emptyTrain = new ArrayList<>();
        try {
            System.out.println("Searching in empty train...");
            searchBogie(emptyTrain, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Case 2: Search on a train WITH bogies
        List<String> train = new ArrayList<>();
        train.add("BG101");
        train.add("BG102");
        train.add("BG103");

        try {
            System.out.println("Searching in loaded train...");
            boolean found = searchBogie(train, "BG102");
            System.out.println("Is 'BG102' present? " + found);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 defensive search completed...");
    }
}