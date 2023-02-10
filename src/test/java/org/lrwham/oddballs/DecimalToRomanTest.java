package org.lrwham.oddballs;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class DecimalToRomanTest {
    @Test
    void testDecimalToRoman() {
        assertEquals("I", DecimalToRoman.DecimalToRoman(1));
        assertEquals("IV", DecimalToRoman.DecimalToRoman(4));
        assertEquals("V", DecimalToRoman.DecimalToRoman(5));
        assertEquals("IX", DecimalToRoman.DecimalToRoman(9));
        assertEquals("X", DecimalToRoman.DecimalToRoman(10));
        assertEquals("XL", DecimalToRoman.DecimalToRoman(40));
        assertEquals("L", DecimalToRoman.DecimalToRoman(50));
        assertEquals("XC", DecimalToRoman.DecimalToRoman(90));
        assertEquals("C", DecimalToRoman.DecimalToRoman(100));
        assertEquals("CD", DecimalToRoman.DecimalToRoman(400));
        assertEquals("D", DecimalToRoman.DecimalToRoman(500));
        assertEquals("CM", DecimalToRoman.DecimalToRoman(900));
        assertEquals("M", DecimalToRoman.DecimalToRoman(1000));
        assertEquals("MMMCMXCIV", DecimalToRoman.DecimalToRoman(3994));

    }
}
