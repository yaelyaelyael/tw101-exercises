package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int target = 1 + new Random().nextInt(100);
        Game game = new Game(target);
        System.out.println("Please guess a number between 1 and 100: ");

        Scanner input = new Scanner(System.in);
        int guess;
        String result = "incorrect";

        while (!result.equals("correct")) {
            guess = input.nextInt();
            result = game.processGuess(guess);
            System.out.println("Your guess was " + result);
        }

        System.out.println("You win!");

        System.out.println("You guessed the following: ");
        for (Integer g : game.getGuessHistory()) {
            System.out.println(g);
        }


    }
}