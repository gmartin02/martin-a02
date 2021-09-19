package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * ask the user for the order amount and store in orderAmount
 * get the state from the user and store in state
 * if the state is WI:
 *      ask the user for the county
 *      if county is Dunn:
 *          add .004 to WI tax
 *      if county is EauClaire:
 *          add .005 to WI tax
 * calculate the tax at the order = orderAmount * tax rate
 * if the state is IL:
 *      taxRate = IL tax rate
 *      calculate the tax at the order = orderAmount * tax rate
 * else:
 *      no taxes added
 * add the tax to orderAmount if applicable = totalAmount
 * print the totalAmount
 * if the state is not WI or IL:
 *      print out the orderAmount as the final amount
 */

public class Solution20 {
    private static double wiSalesTax = 0.05;
    private static final double EAU_CLAIRE_COUNTY_ADDITIONAL_TAX = 0.005;
    private static final double DUNN_COUNTY_ADDITIONAL_TAX = 0.004;

    private static final double IL_SALES_TAX = 0.08;

    private static final Scanner input = new Scanner(System.in);
    private double orderAmount;
    private double tax;
    private double finalAmount;
    private String state;
    private String county;

    public static void main(String[] args) {
        Solution20 solution = new Solution20();
        solution.orderAmount = solution.userInputOrderAmount();
        solution.state = solution.userInputState();

        if (solution.state.equals("Wisconsin")) {
            solution.county = solution.userInputWICounty();

            if(solution.county.equals("EauClaire")){
                wiSalesTax += EAU_CLAIRE_COUNTY_ADDITIONAL_TAX;
            } else if(solution.county.equals("Dunn")){
                wiSalesTax += DUNN_COUNTY_ADDITIONAL_TAX;
            }
            solution.tax = solution.taxCalculation(solution.orderAmount, wiSalesTax);
            solution.finalAmount = solution.tax + solution.orderAmount;

        } else if (solution.state.equals("Illinois")) {
            solution.tax = solution.taxCalculation(solution.orderAmount, IL_SALES_TAX);
            solution.finalAmount = solution.tax + solution.orderAmount;
        }

        solution.orderAmount = Math.round(solution.orderAmount * 100.0) / 100.0;
        solution.tax = Math.round(solution.tax * 100.0) / 100.0;
        solution.finalAmount = Math.round(solution.finalAmount * 100.0) / 100.0;

        System.out.println(solution.state.equals("Wisconsin") || solution.state.equals("Illinois") ? "The subtotal is $" + solution.orderAmount + "\nThe tax is $"
                + solution.tax + "\nThe Total is $" + solution.finalAmount : "The total is $" + solution.orderAmount);
    }

    public double userInputOrderAmount() {
        System.out.println("Enter the order amount: ");
        return input.nextDouble();
    }

    public String userInputState() {
        System.out.println("Enter the state you are in: ");
        state = input.next();
        return state;
    }

    public double taxCalculation(double orderAmount, double taxRate) {
        return orderAmount * taxRate;
    }

    public String userInputWICounty() {
        System.out.println("Are you in EauClaire or Dunn county? ");
        return input.next();
    }
}

