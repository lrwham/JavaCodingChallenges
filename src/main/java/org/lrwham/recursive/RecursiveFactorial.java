package org.lrwham.recursive;

import java.math.BigInteger;

public class RecursiveFactorial {
    public static long factorial(long n){
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        if(n <= 1){
            return 1;
        }

        return n * factorial(n -1);
    }

    public static BigInteger factorialBig(BigInteger n){
        if (n.compareTo(new BigInteger("0")) < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        if(n.compareTo(new BigInteger("1")) <= 0){
            return new BigInteger("1");
        }

        return n.multiply(factorialBig(n.subtract(new BigInteger("1"))));
    }

}
