package org.lrwham;

import org.lrwham.sorting.BubbleSortArray;

public class Main {
    public static void main(String[] args) {

        String[] words = new String[10];
        populateArrayListStrings(words);

        BubbleSortArray sorter = new BubbleSortArray();

        sorter.sort(words);

        for (String s : words){
            System.out.println(s);

        }

        System.out.println("Finished");
        
    }

    private static void populateArrayListStrings(String[] strings){
        
        strings[0] = "x";
        strings[1] = "b";
        strings[2] = "a";
        strings[3] = "d";
        strings[4] = "e";
        strings[5] = "1";
        strings[6] = "2";
        strings[7] = "a1";
        strings[8] = "1a";
        strings[9] = "1";
        
    }
}