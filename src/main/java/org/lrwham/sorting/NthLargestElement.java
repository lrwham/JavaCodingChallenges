package org.lrwham.sorting;

public class NthLargestElement {

    public static long secondLargestElement (long[] array){
        long size = array.length;

        if(size < 2) return -1;

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for(int i = 0; i < size; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }
        }

        return secondLargest;

    }
}
