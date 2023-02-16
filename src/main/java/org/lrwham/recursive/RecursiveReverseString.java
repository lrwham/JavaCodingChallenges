package org.lrwham.recursive;

public class RecursiveReverseString {


    public static String reverse(String s){
        if(s.length() == 0) return s;

        return s.charAt(s.length()-1) + s.substring(0, s.length() - 1);
    }
}
