package org.lrwham.sorting;

public class BubbleSortArray implements SortArray {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] unsorted) {
        int n = unsorted.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (unsorted[j].compareTo(unsorted[j + 1]) > 0) {
                    E temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        return unsorted;
    }
}
