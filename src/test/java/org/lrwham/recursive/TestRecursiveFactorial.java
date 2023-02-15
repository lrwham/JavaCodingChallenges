package org.lrwham.recursive;

import org.junit.jupiter.api.Test;
import org.lrwham.recursive.RecursiveFactorial;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TestRecursiveFactorial {
    @Test
    void testRecursiveFactorial() {
        assertEquals(1L, RecursiveFactorial.factorial(0L));
        assertEquals(1L, RecursiveFactorial.factorial(1L));
        assertEquals(2L, RecursiveFactorial.factorial(2L));
        assertEquals(3628800L, RecursiveFactorial.factorial(10L));
        assertEquals(2432902008176640000L, RecursiveFactorial.factorial(20L));
    }

    @Test
    void testRecursiveFactorialBig(){
        BigInteger x = new BigInteger("3628800");
        BigInteger y = new BigInteger("2432902008176640000");
        BigInteger z = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");

        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("20");
        BigInteger c = new BigInteger("50");
        assertEquals(0, x.compareTo(RecursiveFactorial.factorialBig(a)));
        assertEquals(0, y.compareTo(RecursiveFactorial.factorialBig(b)));
        assertEquals(0, z.compareTo(RecursiveFactorial.factorialBig(c)));


    }
}
