//  
//  Name:       Prince, Alicia
//  Project:    #2
//  Due:        October 5, 2022
//  Course:     cs-1400-03-f22
//
//  Description:
//               This program will allow the participant to play a guessing game. (rerunning this program for CS 2400 Project 0)
// 

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        int high = 100;
        int low = 1;
        int guessCounter = 0;

        if (args.length > 0) {
            rand.setSeed(Long.valueOf(args[0]));
        }
        int secretNumber = rand.nextInt(high-low) + low;

        System.out.println();
        System.out.println("Guess My Number Game by A. Prince ");
        System.out.println();
        System.out.println("A secret number between 1-100 has been generated... ");
        System.out.println();
        System.out.print("Enter your guess? ");
        int guess = keyboard.nextInt();
        System.out.println();
        while(guess != 0)
        {
            guessCounter++;
            if(guess < secretNumber)
            {
                System.out.println("Guess is low, try again. ");
                System.out.print("Enter your guess? ");
                guess = keyboard.nextInt();
                System.out.println();
            }
            else if(guess > secretNumber)
            {
                System.out.println("Guess is high, try again. ");
                System.out.print("Enter your guess? ");
                guess = keyboard.nextInt();
                System.out.println();
            }
            if(guess == secretNumber)
            {
                if(guessCounter == 1)
                {
                    System.out.printf("Congratulations, you got it in %d guess! ", guessCounter);
                    System.out.println();
                    guess = 0;
                }
                else
                {
                    System.out.printf("Correct in %d guesses. ", guessCounter);
                    System.out.println();
                    guess = 0;
                }
            }
            else if(guess == 0)
            {
                System.out.printf("The secret number is %d. ", secretNumber);
                System.out.println();
            }
        }
    }
}
