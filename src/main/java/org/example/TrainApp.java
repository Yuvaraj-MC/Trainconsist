package org.example;
import java.util.ArrayList;
import java.util.List;


public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> bogies = new ArrayList<>();
        System.out.println("Initial bogie count: " + bogies.size());
        System.out.println("Current Train Consist: " + bogies);
        System.out.println("System ready for Operations...");
    }
}