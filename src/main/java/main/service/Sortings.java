package main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortings {

    /**
     * @param numbers array of integer*/
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[i] > numbers[j]) {
                   minIndex = j;
               }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
