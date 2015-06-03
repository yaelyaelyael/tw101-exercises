package com.thoughtworks.tw101.exercises.exercise8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {

    private final int target;
    private ArrayList<Integer> guessHistory = new ArrayList<Integer>();

    public Game(int target) {
        this.target = target;
    }

    public String processGuess(int numGuessed){
        guessHistory.add(numGuessed);
        return evalGuess(numGuessed);
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

    public ArrayList<Integer> getGuessHistory() {
        return guessHistory;
    }

}
