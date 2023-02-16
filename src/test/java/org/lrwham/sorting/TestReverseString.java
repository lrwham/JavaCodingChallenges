package org.lrwham.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestReverseString {

    @Test
    void testReverseString() {
        assertEquals("abcd",ReverseString.reverse("dcba"));
        assertEquals("", ReverseString.reverse(""));
        assertEquals("a", ReverseString.reverse("a"));
        assertEquals("dcba", ReverseString.reverse("abcd"));
        assertEquals("racecar", ReverseString.reverse("racecar"));
        assertEquals("1234", ReverseString.reverse("4321"));
        assertEquals("!dlroW olleH", ReverseString.reverse("Hello World!"));

    }
}
