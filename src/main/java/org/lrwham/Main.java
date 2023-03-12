package org.lrwham;

import java.util.ArrayList;
import java.util.Arrays;

import org.lrwham.sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        populateArrayListStrings(words);

        System.out.println(words);
        System.out.println("\n\n\n");

        InsertionSort<String> sorter = new InsertionSort<>();

        ArrayList<String> sortedWords = sorter.sort(words);

        System.out.println(sortedWords);

        System.out.println("Finished");
        
    }

    private static void populateArrayListStrings(ArrayList<String> strings){
        
        strings.add("x");
        strings.add("b");
        strings.add("a");
        strings.add("d");
        strings.add("e");
        strings.add("1");
    }
}