package org.example;

/**
 * =========================================================
 * MAIN CLASS – UseCase15TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely handles unsafe cargo assignments using
 * a custom runtime exception with try-catch-finally, so the
 * application never crashes.
 * Rule: Petroleum can NOT be assigned to a Rectangular bogie.
 * =========================================================
 */
public class TrainApp {

    // Custom RUNTIME exception for unsafe cargo
    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    // Inner Bogie class for goods bogies
    static class Bogie {
        String shape;
        String cargo;

        Bogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo at runtime, with safety validation
        void assignCargo(String cargo) {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe: Petroleum cannot be assigned to a Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + shape + " -> " + cargo);
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("===============================================\n");

        // Case 1: Safe assignment
        Bogie b1 = new Bogie("Cylindrical");
        try {
            b1.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for b1.\n");
        }

        // Case 2: Unsafe assignment
        Bogie b2 = new Bogie("Rectangular");
        try {
            b2.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for b2.");
        }
        System.out.println("\nUC15 safe handling completed... (app did not crash)");
    }
}