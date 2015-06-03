package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

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
            result = game.evalGuess(guess);
            System.out.println("Your guess was " + result);
        }

        System.out.println("You win!");

    }
}

