package test.main.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import src.main.java.BubbleSort;

public class BubbleSortTest {
    @Test
    public void sortAscendingTest() {
        int[] array = { 2, 1, 3, 5, 4, 9, 7, 8, 6 };
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BubbleSort.sortAscending(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void sortDescendingTest() {
        int[] array = { 2, 1, 3, 5, 4, 9, 7, 8, 6 };
        int[] sortedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        BubbleSort.sortDescending(array);
        assertArrayEquals(array, sortedArray);
    }
}