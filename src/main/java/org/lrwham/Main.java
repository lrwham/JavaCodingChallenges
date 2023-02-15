package org.lrwham;

import org.lrwham.ciphers.Caesar;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        populateArrayListStrings(words);

        Iterator<String> iterator = words.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    private static void populateArrayListStrings(ArrayList<String> strings){
        strings.add("Good morning friend!");
        strings.add("Good morning friend!");
        strings.add("How are you doing today?");
        strings.add("It's a beautiful day outside.");
        strings.add("Let's go for a walk in the park.");
        strings.add("I'm feeling a bit under the weather.");
        strings.add("I just finished a great book!");
        strings.add("Do you have any plans for the weekend?");
        strings.add("I can't wait to see you again.");
        strings.add("Have you tried the new restaurant in town?");
        strings.add("What's your favorite movie?");
        strings.add("I'm so glad we became friends.");
        strings.add("I love spending time with my family.");
        strings.add("Do you like to travel?");
        strings.add("I'm really into hiking and camping.");
        strings.add("It's been a while since we last spoke.");
        strings.add("What kind of music do you enjoy?");
        strings.add("I'm trying to eat healthier these days.");
        strings.add("Have you heard any good jokes lately?");
        strings.add("I need some advice, can you help me out?");
        strings.add("Let's catch up over a cup of coffee.");
    }
}