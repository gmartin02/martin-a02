/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * get principal amount from user
 * get interest rate from user and divide it by 100
 * get number of years from user
 * get compound frequency from user
 * finalAmount = principalAmount *Math.pow((1 + (interestRate/compoundFrequencyYearly)),(numOfYears*compoundFrequencyYearly))
 * print the output using %.2f to round to the nearest hundredth
 */
public class Solution13 {
    private static final Scanner input = new Scanner(System.in);
    private int principalAmount;
    private double interestRate;
    private int numOfYears;
    private int compoundFrequencyYearly;
    private double finalAmount;

    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        solution.principalAmount = solution.principalInput();

        solution.interestRate = solution.interestRateInput();

        solution.numOfYears = solution.yearsInput();

        solution.compoundFrequencyYearly = solution.numOfTimesCompoundedPerYearInput();

        solution.finalAmount = solution.calculateFinalAmount(solution.principalAmount, solution.interestRate, solution.numOfYears, solution.compoundFrequencyYearly);
        System.out.printf("%d invested at %.2f for %d years compounded %d times per year is $%.2f", solution.principalAmount, solution.interestRate, solution.numOfYears, solution.compoundFrequencyYearly, solution.finalAmount);
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

    public int numOfTimesCompoundedPerYearInput(){
        System.out.println("Enter the number of times the interest is compounded per year: ");
        return input.nextInt();
    }

    public double calculateFinalAmount(int principalAmount, double interestRate, int numOfYears, int compoundFrequencyYearly) {
        return (principalAmount *Math.pow((1 + (interestRate/compoundFrequencyYearly)),(numOfYears*compoundFrequencyYearly)));
    }
}


