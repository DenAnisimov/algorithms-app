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
}
