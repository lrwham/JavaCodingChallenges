package org.lrwham;

import org.lrwham.primes.Primes;

public class Main {
    public static void main(String[] args) {

        for(long i = 0; i < 100; i++){
            System.out.print(i);
            System.out.print(" is ");
            System.out.println(Primes.isPrime(i) ? "prime." : " NOT prime.");
        }
    }
}