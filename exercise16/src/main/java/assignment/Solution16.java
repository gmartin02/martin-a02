/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Gabriel Martin
 */

package assignment;

import java.util.Scanner;

/*
 * ask the user to input their age
 * LEGAL_DRIVING_AGE = 16
 * if userAge>=LEGAL_DRIVING_AGE
 *      print that they can legally drive
 * else
 *      print they cannot legally drive
 */
public class Solution16 {
    private static final int LEGAL_DRIVING_AGE = 16;
    private static final Scanner input = new Scanner(System.in);
    private int userAge;

    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        solution.userAge = solution.getUserAge();
        solution.printIfLegal(solution.userAge);

    }

    public int getUserAge(){
        System.out.println("What is your age: ");
        return input.nextInt();
    }

    public void printIfLegal(int userAge) {
        System.out.println(LEGAL_DRIVING_AGE <= userAge ? "You are legally old enough to drive!" : "You are not legally old enough to drive.");
    }


}
