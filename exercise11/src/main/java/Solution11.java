/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Gabriel Martin
 */


import java.util.Scanner;

/*
 * declare usDollars, euros, rate as floats
 * declare the scanner
 * get the user input and store them into euros and rate
 * use Float.parseFloat to change them from string to float
 * usDollars = euros * rate
 * print the output with the %.2f specifier to round to 2 decimal places
 */
public class Solution11 {
    private static final Scanner input = new Scanner(System.in);
    private float usDollars;
    private static float euros;
    private static float rate;

    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        userInput();
        solution.usDollars = solution.conversion();
        printOutput(solution.usDollars);

    }

    private static void userInput() {
        System.out.println("How many euros are you exchanging? ");
        String input1 = input.nextLine();
        euros = Float.parseFloat(input1);

        System.out.println("What is the exchange rate? ");
        String input2 = input.nextLine();
        rate = Float.parseFloat(input2);

    }

    private float conversion() {
        usDollars = euros * rate;
        return usDollars;
    }

    private static void printOutput(float usDollars) {
        System.out.printf("%.2f at an exchange rate of %f is%n%.2f U.S. dollars.", euros, rate, usDollars);
    }

}
