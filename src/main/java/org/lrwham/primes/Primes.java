package org.lrwham.primes;

public class Primes {
    public static boolean isPrime(long n){

        if(n < 2) return false;

        if (n == 2) return true;

        long factorLimit = Math.round(Math.sqrt(n));

        long testFactor = 2;

        if(n % testFactor == 0) return false;

        testFactor = 3;

        while(testFactor <= factorLimit){
            if(n % testFactor == 0) return false;

            // only check odd numbers from now on.
            testFactor += 2;
        }

        return true;

    }
}
