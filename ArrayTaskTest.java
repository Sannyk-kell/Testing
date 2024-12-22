package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTasksTest {

    @Test
    void testFindMinAbsIndex() {
        int[] array = {10, -3, 7, 0, -1};
        assertEquals(3, ArrayTasks.findMinAbsIndex(array));

        int[] array2 = {5, -5, 2, -2};
        assertEquals(2, ArrayTasks.findMinAbsIndex(array2));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayTasks.findMinAbsIndex(new int[]{});
        });
        assertEquals("Массив не має бути пустим.", exception.getMessage());
    }

    @Test
    void testSumBetweenFirstAndLastPositive() {
        int[] array = {1, -5, 2, 3, -1};
        assertEquals(0, ArrayTasks.sumBetweenFirstAndLastPositive(array));

        int[] array2 = {4, -3, 5, -2, 1};
        assertEquals(-5, ArrayTasks.sumBetweenFirstAndLastPositive(array2));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayTasks.sumBetweenFirstAndLastPositive(new int[]{-1, -2, -3});
        });
        assertEquals("Масив має мати як мінімум два позитивних елемента", exception.getMessage());
    }

    @Test
    void testGenerateRandomArray() {
        int[] array = ArrayTasks.generateRandomArray(5);
        assertEquals(5, array.length);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayTasks.generateRandomArray(0);
        });
        assertEquals("Масив має бути більше ніж 0", exception.getMessage());
    }
}
