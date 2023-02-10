package org.lrwham.primes;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class IsPrimeTest {
    @Test
    void testIsPrime() {
        assertEquals(true, Primes.isPrime(2));
        assertEquals(true, Primes.isPrime(3));
        assertEquals(true, Primes.isPrime(5));
        assertEquals(true, Primes.isPrime(7));
        assertEquals(true, Primes.isPrime(11));
        assertEquals(true, Primes.isPrime(13));
        assertEquals(false, Primes.isPrime(8));
        assertEquals(false, Primes.isPrime(21));
        assertEquals(false, Primes.isPrime(64));
        assertEquals(false, Primes.isPrime(128));
    }
}
