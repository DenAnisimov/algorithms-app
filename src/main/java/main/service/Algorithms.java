package main.service;

public class Algorithms {

    /**
     * @param numbers massive of data
     * @param target target number
     * @return index of number in massive or -1 if target not found*/
    public static int simpleSearch(int[] numbers, int target) {
        int index = -1;
        for(int i = 0; i < numbers.length; i++) {
            if (i == target) {
                index = i;
            }
        }
        return index;
    }

    /**
     * @param numbers massive of data
     * @param target target number
     * @return index of number in massive or -1 if target not found*/
    public static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int middle;
        int guess;
        while (low <= high) {
            middle = (low + high) / 2;
            guess = numbers[middle];
            if (guess == target) {
                return middle;
            }
            if (guess > target) {
                high = middle - 1;
            }
            if (guess < target) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
