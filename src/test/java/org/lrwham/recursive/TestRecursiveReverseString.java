package org.lrwham.recursive;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRecursiveReverseString {

    @Test
    void testRecursiveReverseString(){
        assertEquals("abcd", RecursiveReverseString.reverse("dcba"));
        assertEquals("", RecursiveReverseString.reverse(""));
        assertEquals("a", RecursiveReverseString.reverse("a"));
        assertEquals("dcba", RecursiveReverseString.reverse("abcd"));
        assertEquals("racecar", RecursiveReverseString.reverse("racecar"));
        assertEquals("1234", RecursiveReverseString.reverse("4321"));
        assertEquals("!dlroW olleH", RecursiveReverseString.reverse("Hello World!"));

    }
}
