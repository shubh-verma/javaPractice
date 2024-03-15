package org.example;

public class Prime {
    boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i == number / i) {
                    count++;
                } else {
                    count = count + 2;
                }
            }
        }
        return count == 2;
    }
}
