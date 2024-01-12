package main;

import main.service.Algorithms;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Algorithms.simpleSearch(generateMassive(999_999_999), 999_999_998);
        long end = System.currentTimeMillis() - start;
        System.out.println("Simple search milliseconds: " + end);

        start = System.currentTimeMillis();
        Algorithms.binarySearch(generateMassive(999_999_999), 999_999_998);
        end = System.currentTimeMillis() - start;
        System.out.println("Binary search milliseconds: " + end);
    }

    public static int[] generateMassive(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }
        return mass;
    }
}