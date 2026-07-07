package org.example;

/**
 * =========================================================
 * MAIN CLASS – UseCase19TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 19: Binary Search for Bogie ID (Optimized)
 *
 * Description:
 * This class searches for a bogie ID in a SORTED array
 * using the Binary Search algorithm (divide-and-conquer).
 * =========================================================
 */

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("===============================================\n");

        // Bogie IDs — MUST be sorted for binary search
        String[] bogieIds = {"BG101", "BG102", "BG103", "BG104", "BG105"};

        // ID to search
        String searchKey = "BG105";

        // Binary Search logic
        int low = 0;
        int high = bogieIds.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;               // middle index
            int compare = bogieIds[mid].compareTo(searchKey);

            if (compare == 0) {
                foundIndex = mid;                     // match found
                break;
            } else if (compare < 0) {
                low = mid + 1;                        // search right half
            } else {
                high = mid - 1;                       // search left half
            }
        }

        // Display result
        if (foundIndex != -1) {
            System.out.println("Bogie '" + searchKey + "' found at index " + foundIndex);
        } else {
            System.out.println("Bogie '" + searchKey + "' not found in the consist");
        }

        System.out.println("\nUC19 binary search completed...");
    }
}