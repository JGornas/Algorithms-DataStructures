package test.main.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import src.main.java.Quicksort;

public class QuickSortTest {
    @Test
    public void sortTest() {
        int[] array = { 2, 1, 3, 5, 4, 9, 7, 8, 6 };
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Quicksort.sort(array, 0, array.length - 1);
        assertArrayEquals(array, sortedArray);
    }
}
