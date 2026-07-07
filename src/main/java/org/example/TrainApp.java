package org.example;

import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS – UseCase16TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 *
 * Description:
 * This class sorts passenger bogie capacities using the
 * Bubble Sort algorithm manually, WITHOUT using
 * Arrays.sort() or Collections.sort().
 * =========================================================
 */
public class TrainApp {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC16 - Bubble Sort (Capacities) ");
        System.out.println("===============================================\n");

        // Array of passenger bogie capacities (unsorted)
        int[] capacities = {72, 24, 90, 56, 40};

        System.out.println("Before sorting: " + Arrays.toString(capacities));

        int n = capacities.length;

        // Bubble Sort: nested loops
        for (int i = 0; i < n - 1; i++) {              // number of passes
            for (int j = 0; j < n - 1 - i; j++) {      // compare adjacent
                if (capacities[j] > capacities[j + 1]) {
                    // swap using a temp variable
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting:  " + Arrays.toString(capacities));

        System.out.println("\nUC16 bubble sort completed...");
    }
}