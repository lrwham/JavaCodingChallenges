package org.lrwham.oddballs;

public class WordCount {
    public static int wordCount(String s) {
        int count = 0;

        int index = 0;

        while (index < s.length()) {
            // Traverse non-alphabetic characters to first word.
            while (index < s.length() && !Character.isAlphabetic(s.charAt(index))) {
                index++;
            }
            if(index < s.length() && Character.isAlphabetic(s.charAt(index))) count++;
            while (index < s.length() && Character.isAlphabetic(s.charAt(index))) {
                index++;
            }
        }

        return count;
    }

}
