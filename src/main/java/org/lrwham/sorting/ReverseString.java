package org.lrwham.sorting;

public class ReverseString {
    public static String reverse(String s){
        if(s.length() <= 1) return s;

        char[] originalChars = s.toCharArray();
        char[] reversedChars = new char[originalChars.length];


        for(int i = originalChars.length - 1, j = 0; i >= 0; i--, j++){
            reversedChars[j] = originalChars[i];
        }

        return new String(reversedChars);
    }
}
