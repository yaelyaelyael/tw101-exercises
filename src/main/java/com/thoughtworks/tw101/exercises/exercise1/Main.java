package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int sum = 0;

        for (int i = min; i < max; i++) {
            if (i%2 != 0) {  //checks if number is odd
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);

    }
}
