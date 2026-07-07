package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase12TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class checks whether all goods bogies follow safety
 * rules using Stream allMatch() with conditional logic.
 * Rule: Cylindrical bogies must carry only Petroleum.
 * =========================================================
 */
public class TrainApp {

    // Inner Bogie class for goods bogies (shape + cargo)
    static class Bogie {
        String shape;
        String cargo;

        Bogie(String shape, String cargo) {
            this.shape = shape;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("===============================================\n");

        // Create list of goods bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Rectangular", "Coal"));
        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Rectangular", "Grains"));

        // Display bogies
        System.out.println("Goods bogies in the train:");
        for (Bogie b : bogies) {
            System.out.println("   " + b.shape + " -> " + b.cargo);
        }

        // Safety rule: Cylindrical bogies must carry only Petroleum
        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.shape.equals("Cylindrical")
                        || b.cargo.equals("Petroleum"));

        // Display result
        System.out.println("\nIs the train safety compliant? " + isSafe);

        System.out.println("\nUC12 safety check completed...");
    }
}