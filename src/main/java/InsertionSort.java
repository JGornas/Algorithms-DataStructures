package src.main.java;

public class InsertionSort {
    public static void sort(int[] array) {
        if (array.length <= 1) { return; }
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }
}
