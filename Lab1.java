package org.example;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

class ArrayTasks {

    // Method to generate a random array with values in the range [-100, 100]
    public static int[] generateRandomArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Масив має бути більше ніж 0");
        }

        Random random = new Random();
        return random.ints(size, -100, 101).toArray();
    }

    // Method to find the index of the element with the smallest absolute value
    public static int findMinAbsIndex(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не має бути пустим");
        }

        int minAbsIndex = 0;
        int minAbsValue = Math.abs(array[0]);

        for (int i = 1; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (absValue < minAbsValue) {
                minAbsValue = absValue;
                minAbsIndex = i;
            }
        }

        return minAbsIndex;
    }

    // Method to calculate the sum of elements between the first and last positive elements
    public static int sumBetweenFirstAndLastPositive(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не має бути пустим.");
        }

        int firstPositiveIndex = -1;
        int lastPositiveIndex = -1;

        // Find indices of the first and last positive elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (firstPositiveIndex == -1) {
                    firstPositiveIndex = i;
                }
                lastPositiveIndex = i;
            }
        }

        if (firstPositiveIndex == -1 || lastPositiveIndex == -1 || firstPositiveIndex == lastPositiveIndex) {
            throw new IllegalArgumentException("Масив має мати як мінімум два позитивних елемента");
        }

        // Calculate the sum of elements between the first and last positive elements
        int sum = 0;
        for (int i = firstPositiveIndex + 1; i < lastPositiveIndex; i++) {
            sum += array[i];
        }

        return sum;
    }

    // Main method to test functionality
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        System.out.println("Згенерований масив: " + Arrays.toString(array));

        try {
            int minAbsIndex = findMinAbsIndex(array);
            System.out.println("Індекс елемента з найменшим значенням: " + minAbsIndex);
            System.out.println("Значення: " + array[minAbsIndex]);
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        }

        try {
            int sum = sumBetweenFirstAndLastPositive(array);
            System.out.println("Сума елементів між першим та останнім позитивним елементом: " + sum);
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
