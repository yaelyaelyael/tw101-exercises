package com.thoughtworks.tw101.exercises.exercise7;

public class Game {

    private final int target;

    public Game(int target) {
        this.target = target;
    }

    public String evalGuess(int numGuessed) {
        String result = null;
        if (numGuessed == target) {
            result = "correct";
        }
        else if (numGuessed < target) {
            result = "too low";
        }
        else if (numGuessed > target) {
            result = "too high";
        }
        return result;
    }

}