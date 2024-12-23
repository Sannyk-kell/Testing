package org.example;

import java.util.Arrays;
import java.util.Random;

class ArraySumOddIndices {

    // Method to calculate the sum of elements at odd indices
    public static int sumOddIndices(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    // Method to generate a random array with values in the range [-100, 100]
    public static int[] generateRandomArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Array size must be greater than 0.");
        }

        Random random = new Random();
        return random.ints(size, -100, 101).toArray();
    }

    // Main method to test functionality
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        System.out.println("Generated Array: " + Arrays.toString(array));

        try {
            int sum = sumOddIndices(array);
            System.out.println("Sum of elements at odd indices: " + sum);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}