package org.example;

import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS – UseCase17TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class sorts bogie type names alphabetically using
 * Java's built-in Arrays.sort() method (no manual logic).
 * =========================================================
 */
public class TrainApp {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC17 - Sort Bogie Names (Arrays.sort) ");
        System.out.println("===============================================\n");

        // Array of bogie type names (unsorted)
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Cargo"};

        System.out.println(Arrays.toString(bogieNames));

      String [] sorted =  bogieNames.clone() ;
      Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}