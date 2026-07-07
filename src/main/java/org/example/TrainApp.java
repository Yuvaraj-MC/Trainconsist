package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS – UseCase13TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * This class benchmarks loop-based filtering versus
 * stream-based filtering using System.nanoTime().
 * =========================================================
 */
public class TrainApp {

    // Inner Bogie class to model bogies
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
        System.out.println(" UC13 - Performance: Loops vs Streams ");
        System.out.println("===============================================\n");

        // Create a large list of bogies for testing
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }

        // ---------- LOOP-BASED FILTERING ----------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------- STREAM-BASED FILTERING ----------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------- RESULTS ----------
        System.out.println("Loop filtered count   : " + loopResult.size());
        System.out.println("Stream filtered count : " + streamResult.size());
        System.out.println();
        System.out.println("Loop   execution time : " + loopTime + " ns");
        System.out.println("Stream execution time : " + streamTime + " ns");

        System.out.println("\nUC13 benchmarking completed...");
    }
}