/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 Gabriel Martin
 */

package assignment;

import java.util.Scanner;

/*
 * ask the user for a month number
 * use the month number to traverse through the switch cases
 * assign monthString to the name of the month in case userInput
 * print the name of the month after assigning
 */
public class Solution21 {
    private static final Scanner input = new Scanner(System.in);
    private String monthString;
    private int month;

    public static void main(String[] args) {
        Solution21 solution = new Solution21();
        solution.month = solution.userInputMonth();

        solution.monthString = solution.monthToName(solution.month);

        System.out.printf("The name of the month is %s", solution.monthString);
    }

    public int userInputMonth() {
        System.out.println("Please enter the number of the month: ");
        return input.nextInt();
    }

    public String monthToName(int month){
        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month.";
                break;
        }
        return monthString;
    }
}
