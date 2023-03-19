package org.lrwham.sorting;

public class InsertionSortArray implements SortArray {
    @Override
    public <E extends Comparable<E>> void sort(E[] unsorted) {
        sort(unsorted, 0, unsorted.length);
    }

    public <E extends Comparable<E>> void  sort(E[] unsorted, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = i; j > start && unsorted[j].compareTo(unsorted[j - 1]) < 0; j--) {
                E temp = unsorted[j];
                unsorted[j] = unsorted[j-1];
                unsorted[j-1] = temp;
            }
        }
    }

    public static void main(String[] args){
        Integer[] nums = {3,6,7,54,10,1,0};

        for(Integer n: nums) System.out.print(n + " ");
        System.out.println();

        InsertionSortArray sorter = new InsertionSortArray();

        sorter.sort(nums);

        for(Integer n: nums) System.out.print(n + " ");
        System.out.println();
    }
}
