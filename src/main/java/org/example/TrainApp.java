package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS – UseCase9TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 *
 * Description:
 * This class groups bogies into categories (Passenger / Goods)
 * using the Stream API and Collectors.groupingBy.
 * =========================================================
 */
public class TrainApp {

    // Inner Bogie class with a type field for grouping
    static class Bogie {
        String name;
        int capacity;
        String type;

        Bogie(String name, int capacity, String type) {
            this.name = name;
            this.capacity = capacity;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("===============================================\n");

        // Create list of bogies with type
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cylindrical", 80, "Goods"));

        // Group bogies by their type using groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display the grouped structure
        System.out.println("Bogies grouped by type:\n");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("   " + b.name + " -> " + b.capacity);
            }
        }
        System.out.println("\nUC9 grouping completed...");
    }
}