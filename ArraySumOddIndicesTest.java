package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySumOddIndicesTest {

    @Test
    void testSumOddIndices() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertEquals(12, ArraySumOddIndices.sumOddIndices(array)); // 2 + 4 + 6 = 12

        int[] array2 = {10, -10, 20, -20, 30, -30};
        assertEquals(-60, ArraySumOddIndices.sumOddIndices(array2)); // -10 + (-20) + (-30) = -60

        int[] array3 = {0};
        assertEquals(0, ArraySumOddIndices.sumOddIndices(array3)); // No odd indices

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArraySumOddIndices.sumOddIndices(new int[]{});
        });
        assertEquals("Array must not be null or empty.", exception.getMessage());
    }

    @Test
    void testGenerateRandomArray() {
        int[] array = ArraySumOddIndices.generateRandomArray(5);
        assertEquals(5, array.length);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArraySumOddIndices.generateRandomArray(0);
        });
        assertEquals("Array size must be greater than 0.", exception.getMessage());
    }
}
