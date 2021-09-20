/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Gabriel Martin
 */

package assignment;

import java.util.Scanner;

/*
 * make a method to receive yes or no from the user
 * using the PlantUML diagram make nested if and else statements following it
 * print out each question and response as you go
 */
public class Solution23 {
    private static final Scanner input = new Scanner(System.in);
    private String userAnswer;

    public static void main(String[] args) {
        Solution23 solution = new Solution23();

        System.out.println("Please only answer using 'yes' or 'no'");
        System.out.println("Is the car silent when you turn the key?");
        solution.userAnswer = solution.userInput();

        if (solution.userAnswer.equals("yes")){
            System.out.println("Are the battery terminals corroded?");
            solution.userAnswer = solution.userInput();

            if (solution.userAnswer.equals("yes")){
                System.out.println("Clean the terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.println("Does the car make a slicking noise?");
            solution.userAnswer = solution.userInput();

            if (solution.userAnswer.equals("yes")){
                System.out.println("Replace the battery.");
            } else {
                System.out.println("Does the car crank up but fail to start?");
                solution.userAnswer = solution.userInput();

                if (solution.userAnswer.equals("yes")){
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.println("Does the engine start then die?");
                    solution.userAnswer = solution.userInput();

                    if (solution.userAnswer.equals("yes")){
                        System.out.println("Does your car have fuel injection?");
                        solution.userAnswer = solution.userInput();

                        if (solution.userAnswer.equals("yes")){
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }

            }
        }
    }

    public String userInput() {
        return input.nextLine();
    }
}
