package org.example;

import java.util.regex.Pattern;

/**
 * =========================================================
 * MAIN CLASS – UseCase11TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 *
 * Description:
 * This class validates Train ID and Cargo Code formats
 * using Regular Expressions (Pattern and Matcher).
 * =========================================================
 */
public class TrainApp {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("===============================================\n");

        // Define regex patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Compile the patterns
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Sample inputs to validate
        String trainId1 = "TRN-1234";   // valid
        String trainId2 = "TRAIN12";    // invalid
        String cargoCode1 = "PET-AB";   // valid
        String cargoCode2 = "PET-12";   // invalid

        // Validate Train IDs
        System.out.println("Train ID '" + trainId1 + "' valid? "
                + trainPattern.matcher(trainId1).matches());
        System.out.println("Train ID '" + trainId2 + "' valid? "
                + trainPattern.matcher(trainId2).matches());

        // Validate Cargo Codes
        System.out.println("Cargo Code '" + cargoCode1 + "' valid? "
                + cargoPattern.matcher(cargoCode1).matches());
        System.out.println("Cargo Code '" + cargoCode2 + "' valid? "
                + cargoPattern.matcher(cargoCode2).matches());

        System.out.println("\nUC11 validation completed...");
    }
}