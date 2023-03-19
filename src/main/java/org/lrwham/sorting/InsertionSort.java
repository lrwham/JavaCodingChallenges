package org.lrwham.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort<E extends Comparable<E>> implements Sort<E>{

    public static void main(String[] args){
        ArrayList<Integer> u = new ArrayList<Integer>(Arrays.asList(12,7,6,0,14));

        InsertionSort<Integer> intSorter = new InsertionSort<>();
        System.out.println(u);
        u = intSorter.sort(u);
        System.out.println(u);

    }

    @Override
    public ArrayList<E> sort(ArrayList<E> unsorted) {
        // empty lists or lists with
        if(unsorted.size() <= 1) return unsorted;

        ArrayList<E> sorted = new ArrayList<E>(unsorted.size());

        // add an intitial element
        sorted.add(unsorted.remove(0));

        while(unsorted.size() > 0){
            E unsortedItem = unsorted.remove(0);

            for(int sortedIndex = 0; sortedIndex <= sorted.size(); sortedIndex++){
                if(sortedIndex >= sorted.size() || unsortedItem.compareTo(sorted.get(sortedIndex)) < 0){
                    sorted.add(sortedIndex,unsortedItem);
                    break;
                }
            }
        }
        return sorted;
    }

    @Override
    public boolean isSorted(ArrayList<E> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isSorted'");
    }
    
}
