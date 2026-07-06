package org.example;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after adding: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Bogies after removing AC Chair: " + passengerBogies);

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + hasSleeper);

        System.out.println("Final bogie count: " + passengerBogies.size());
    }
}