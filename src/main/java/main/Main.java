package main;

import main.service.Algorithms;
import main.service.Sortings;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Algorithms.simpleSearch(generateArray(999_999_999), 999_999_998);
        long end = System.currentTimeMillis() - start;
        System.out.println("Simple search milliseconds: " + end);

        start = System.currentTimeMillis();
        Algorithms.binarySearch(generateArray(999_999_999), 999_999_998);
        end = System.currentTimeMillis() - start;
        System.out.println("Binary search milliseconds: " + end);

        start = System.currentTimeMillis();
        Sortings.selectionSort(generateReverseArray(100_000));
        end = System.currentTimeMillis() - start;
        System.out.println("Selection sort milliseconds: " + end);
    }

    public static int[] generateArray(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }
        return mass;
    }

    public static int[] generateReverseArray(int size) {
        int[] array = new int[size];
        int arrayLength = size;
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayLength--;
        }
        return array;
    }
}