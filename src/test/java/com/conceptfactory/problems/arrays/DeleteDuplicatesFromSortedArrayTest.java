package com.conceptfactory.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDuplicatesFromSortedArrayTest {

    DeleteDuplicatesFromSortedArray uut = new DeleteDuplicatesFromSortedArray();

    @Test
    void dedupe() {
        int[] input = new int[] { 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 7 };

        assertEquals(7, uut.dedupe(input));
    }

    @Test
    void dedupe1() {
        int[] input = new int[] { };

        assertEquals(0, uut.dedupe(input));
    }

    @Test
    void dedupe2() {
        int[] input = new int[] { 1 };

        assertEquals(1, uut.dedupe(input));
    }

    @Test
    void dedupe3() {
        int[] input = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };

        assertEquals(1, uut.dedupe(input));
    }
}
