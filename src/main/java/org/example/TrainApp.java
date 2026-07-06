package org.example;
//       uniqueness+fastaccess+insertionorder
import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");  // duplicate

        System.out.println("Train formation: " + trainFormation);
        System.out.println("Total unique bogies: " + trainFormation.size());
    }
}