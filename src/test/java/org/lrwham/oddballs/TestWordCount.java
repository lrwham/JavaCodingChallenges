package org.lrwham.oddballs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestWordCount {
    @Test
    void testWordCountWithSingleWord(){
        assertEquals(1, WordCount.wordCount("hello"));
        assertEquals(1, WordCount.wordCount("world"));
        assertEquals(1, WordCount.wordCount("java"));
    }

    @Test
    void testWordCountWithMultipleWords(){
        assertEquals(2, WordCount.wordCount("Hello, world!"));
        assertEquals(4, WordCount.wordCount("The quick brown fox"));
        assertEquals(5, WordCount.wordCount("This is a test sentence."));
    }

    @Test
    void testWordCountWithEmptyString(){
        assertEquals(0, WordCount.wordCount(""));
    }

    @Test
    void testWordCountWithOnlyWhitespace(){
        assertEquals(0, WordCount.wordCount("    "));
        assertEquals(0, WordCount.wordCount(" \n \t \r "));
    }

    @Test
    void testWordCountWithNumbersAndSymbols(){
        assertEquals(0, WordCount.wordCount("12345"));
        assertEquals(0, WordCount.wordCount("@#$%&"));
        assertEquals(1, WordCount.wordCount("1,000,000 dollars"));
    }

    @Test
    void testWordCountWithLeadingAndTrailingSpaces(){
        assertEquals(3, WordCount.wordCount("  one  two  three   "));
        assertEquals(3, WordCount.wordCount("  java is  fun   "));
    }
}
