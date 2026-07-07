package org.example;

/**
 * =========================================================
 * MAIN CLASS – UseCase18TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class searches for a specific bogie ID in an
 * unsorted array using the Linear Search algorithm.
 * =========================================================
 */
public class TrainApp {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("===============================================\n");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG103", "BG101", "BG105", "BG102", "BG104"};

        // ID to search
        String searchKey = "BG102";

        // Linear Search logic
        int foundIndex = -1;   // -1 means "not found" (default)

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                foundIndex = i;   // match found, store the index
                break;            // stop searching (early termination)
            }
        }

        // Display result
        if (foundIndex != -1) {
            System.out.println("Bogie '" + searchKey + "' found at index " + foundIndex);
        } else {
            System.out.println("Bogie '" + searchKey + "' not found in the consist");
        }

        System.out.println("\nUC18 linear search completed...");
    }
}