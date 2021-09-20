/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Gabriel Martin
 */

package assignment;

import java.util.Scanner;

/*
 * get weight from user
 * get gender from user
 *      if the user does not enter 1 or 2 have them enter a valid number after going through the others
 * get how much alcohol was consumed by the user
 * get the time since last drink from the user
 *      !!!!!if input is anything but an int it will prompt to enter the value again
 * using gender check if it is 1 or 2 to set the correct alcohol ratio distribution
 * bac = (alcohol consumed * 5.14/weight * alcohol ratio distribution) - 0.015 * timeSinceLastDrink
 * if bac >= 0.08
 *      print illegal driver
 * else
 *      print legal driver
 *
 */
public class Solution17 {
    private static final Scanner input = new Scanner(System.in);
    private int weight;
    private int gender;
    private int alcoholConsumed;
    private int timeSinceLastDrink;
    private double correctRatio;
    private static final double MALE_DISTRIBUTION_RATIO = 0.73;
    private static final double FEMALE_DISTRIBUTION_RATIO = 0.73;
    private double bac;

    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        solution.weight = solution.userInputWeight();
        solution.gender = solution.userInputGender();
        solution.alcoholConsumed = solution.userInputAlcoholConsumed();
        solution.timeSinceLastDrink = solution.userInputTimeSinceLastDrink();

        solution.correctRatio = solution.checkGender(solution.gender);


        solution.bac = solution.calculateBac(solution.weight, solution.correctRatio, solution.alcoholConsumed, solution.timeSinceLastDrink);

        System.out.printf("Your BAC is %f", solution.bac);

        if(solution.bac >= 0.08){
            System.out.println("\nIt is not legal for you to drive.");
        } else {
            System.out.println("\nIt is legal for you to drive!");
        }
    }

    public int userInputWeight() {
        System.out.println("What is your weight in pounds? ");

        if(input.hasNextDouble()){
            return input.nextInt();
        } else {
            input.next();
        }
        return userInputWeight();
    }

    public int userInputGender() {
        System.out.println("Enter a 1 if you are a male and a 2 if you are a female.");

        if(input.hasNextDouble()){
            return input.nextInt();
        } else {
            input.next();
        }
        return userInputGender();
    }

    public int userInputAlcoholConsumed() {
        System.out.println("How much alcohol did you consume in ounces?");

        if(input.hasNextDouble()){
            return input.nextInt();
        } else {
            input.next();
        }
        return userInputAlcoholConsumed();
    }

    public int userInputTimeSinceLastDrink() {
        System.out.println("How long in hours has it been since your last drink? ");

        if(input.hasNextDouble()){
            return input.nextInt();
        } else {
            input.next();
        }
        return userInputTimeSinceLastDrink();
    }

    public double checkGender(int gender){
        if (gender == 1){
            return MALE_DISTRIBUTION_RATIO;
        } else if (gender == 2) {
            return FEMALE_DISTRIBUTION_RATIO;
        } else {
            System.out.println("Invalid input for gender.");
            userInputGender();
            return 0;
        }
    }
    public double calculateBac(int weight, double correctRatio, int alcoholConsumed, int timeSinceLastDrink) {
        return (alcoholConsumed * 5.14/weight * correctRatio) - 0.015 * timeSinceLastDrink;
    }
}
