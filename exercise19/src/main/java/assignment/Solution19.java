package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Gabriel Martin
 */
import java.util.Scanner;

/*
 * ask user for their weight in pounds
 * ask user for their height in inches
 *      for either input use hasNextDouble to ensure that the input entered is a double
 * bmi = (weight / (height * height)) * 703
 * if bmi < 25
 *      print overweight
 * if 18.5 < bmi < 25
 *      print healthy
 * if 0 < bmi < 18.5
 *      print underweight
 */
public class Solution19 {
    private static final Scanner input = new Scanner(System.in);
    private double weight;
    private double height;
    private double bmi;

    public static void main(String[] args) {
        Solution19 solution = new Solution19();

        solution.height = solution.userInputHeight();
        solution.weight = solution.userInputWeight();

        solution.bmi = solution.calculateBmi(solution.height, solution.weight);
        System.out.printf("Your BMI is %.2f%n", solution.bmi);

        if(solution.bmi > 25.0){
            System.out.println("You are overweight. You should go see a doctor.");
        } else if(solution.bmi > 18.5) {
            System.out.println("You are within the ideal weight range!");
        } else {
            System.out.println("You are underweight. You should go see a doctor.");
        }
    }

    public double userInputHeight() {
        System.out.println("Please enter your height in inches: ");

        if(input.hasNextDouble()){
            return input.nextDouble();
        } else {
            input.next();
        }
        return userInputHeight();
    }

    public double userInputWeight() {
        System.out.println("Please enter your weight in pounds: ");

        if(input.hasNextDouble()){
            return input.nextDouble();
        } else {
            input.next();
        }
        return userInputWeight();
    }

    public double calculateBmi(double height, double weight) {
        return (weight / (height * height)) * 703;
    }
}
