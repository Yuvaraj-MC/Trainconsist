package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS – UseCase8TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using the Java Stream API.
 * =========================================================
 */
public class TrainApp {

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
        System.out.println(" UC8 - Filter Bogies Using Streams ");
        System.out.println("===============================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Filter bogies with capacity greater than 60 using Stream
        List<Bogie> highCapacity = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Bogies with capacity greater than 60:");
        for (Bogie b : highCapacity) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}