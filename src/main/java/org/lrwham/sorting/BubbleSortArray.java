package org.lrwham.sorting;

public class BubbleSortArray implements SortArray {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] unsorted){
        for(int i = 0; i < unsorted.length; i++){
            boolean swapped = false;
            for(int j = i + 1; j < unsorted.length; j++){
                if(unsorted[i].compareTo(unsorted[j]) > 0){
                    E temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) return unsorted;
        }

        return unsorted;
    }

}
