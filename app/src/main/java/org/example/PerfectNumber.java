package org.example;

public class PerfectNumber {
    boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == num){
            return true;
        }else {
            return false;
        }
    }
}