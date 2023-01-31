package org.lrwham.fibonacci;

public class Fibonacci {

    public static long NthFibonacci(long n) throws IllegalArgumentException {

        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 0");
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long currentIndex = 2;
            long previous = 1;
            long current = 1;

            while (currentIndex < n) {
                long temp = previous;
                previous = current;
                current = temp + previous;
                currentIndex++;
            }

            return current;
        }
    }
}
