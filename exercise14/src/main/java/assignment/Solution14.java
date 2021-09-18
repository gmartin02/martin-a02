package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * ask the user for the order amount and store in orderAmount
 * get the state from the user and store in state
 * if the state is WI:
 *      calculate the tax at the order = orderAmount * 5.5%
 *      add the tax to orderAmount
 *      print the totalAmount
 * if the state is not WI:
 *      print out the orderAmount as the final amount
 */
public class Solution14 {
    private static final Scanner input = new Scanner(System.in);
    private double orderAmount;
    private double tax;
    private double finalAmount;
    private String state;

    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        solution.orderAmount = solution.userInputOrderAmount();
        solution.state = solution.userInputState();

        if(solution.state.equals("WI")) {
            solution.tax = solution.taxCalculation(solution.orderAmount);
            solution.finalAmount = solution.tax + solution.orderAmount;
        }

        solution.orderAmount = Math.round(solution.orderAmount*100.0)/100.0;

        System.out.println(solution.state.equals("WI") ? "The subtotal is $" + solution.orderAmount + "\nThe tax is $"
                + solution.tax + "\nThe Total is $" + solution.finalAmount: "The total is $" + solution.orderAmount );
    }

    public double userInputOrderAmount(){
        System.out.println("Enter the order amount: ");
        return input.nextDouble();
    }

    public String userInputState(){
        System.out.println("Enter the state you are in: ");
        state = input.next();
        return state;
    }

    public double taxCalculation(double orderAmount) {
        return orderAmount * 0.055;
    }
}
