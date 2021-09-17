/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * get principal amount from user
 * get interest rate from user and divide it by 100
 * get number of years from user
 * finalAmount = principalAmount *(1 + (interestRate*numOfYears))
 * print the output using %.2f to round to the nearest hundredth
 */
public class Solution12 {
    private static final Scanner input = new Scanner(System.in);
    private int principalAmount;
    private double interestRate;
    private int numOfYears;
    private double finalAmount;

    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        solution.principalAmount = solution.principalInput();

        solution.interestRate = solution.interestRateInput();

        solution.numOfYears = solution.yearsInput();

        solution.finalAmount = solution.calculateFinalAmount(solution.principalAmount, solution.interestRate, solution.numOfYears);
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", solution.numOfYears, solution.interestRate*100, solution.finalAmount);


    }

    public int principalInput(){
        System.out.println("Enter the principal: ");
        return input.nextInt();
    }

    public double interestRateInput(){
        System.out.println("Enter the interest rate: ");
        return input.nextDouble()/100;
    }

    public int yearsInput(){
        System.out.println("Enter the number of years: ");
        return input.nextInt();
    }

    public double calculateFinalAmount(int principalAmount, double interestRate, int numOfYears) {
        return (principalAmount *(1 + (interestRate*numOfYears)));
    }
}
