package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i%2 != 0) { //checks is number is odd
                sum += i;
            }
        }

        return sum;
    }
}