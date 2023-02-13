package org.lrwham.ciphers;

import org.junit.jupiter.api.Test;
import org.lrwham.ciphers.Caesar;

import static org.junit.Assert.assertEquals;

public class TestCaesar {
    @Test
    void testCaesar() {
        assertEquals(true, Caesar.encipher("Hello, World!", 6).equals("Nkrru, Cuxrj!"));
    }

    @Test
    public void testEncipher() {
        String message = "hello";
        int key = 3;
        String expected = "khoor";
        String actual = Caesar.encipher(message, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecipher() {
        String secret = "khoor";
        int key = 3;
        String expected = "hello";
        String actual = Caesar.decipher(secret, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testEncipherWithNegativeKey() {
        String message = "hello";
        int key = -3;
        String expected = "ebiil";
        String actual = Caesar.encipher(message, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecipherWithNegativeKey() {
        String secret = "ebiil";
        int key = -3;
        String expected = "hello";
        String actual = Caesar.decipher(secret, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testEncipherWithLargeKey() {
        String message = "hello";
        int key = 30;
        String expected = "lipps";
        String actual = Caesar.encipher(message, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecipherWithLargeKey() {
        String secret = "lipps";
        int key = 30;
        String expected = "hello";
        String actual = Caesar.decipher(secret, key);
        assertEquals(expected, actual);
    }
}
