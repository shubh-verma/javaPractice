package org.example;

public class CheckNumber {
    public static Boolean isPrime(int number) {
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

    public static Boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum == num;
    }
}
