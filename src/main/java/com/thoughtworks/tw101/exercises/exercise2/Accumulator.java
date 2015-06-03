package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int numberOfCalls = 0;

    public void increment() {
        numberOfCalls++;
    }

    public void total() {
        System.out.println(numberOfCalls);
    }

}
