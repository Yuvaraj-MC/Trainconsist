package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase10TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * This class calculates the total seating capacity of the
 * train by aggregating bogie capacities using Stream reduce.
 * =========================================================
 */
public class TrainApp{

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("===============================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Extract capacities using map(), then sum them using reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
//        .reduce(0, (a, b) -> a + b)

        // Display total seating capacity
        System.out.println("Total seating capacity of the train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");

    }
}