package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Martin
 */

import java.time.Year;
import java.util.Scanner;

/*
 * create Scanner object
 * prompt for current age
 * input1 = user input
 * currentAge = input1 but as an int
 * prompt for retire age
 * input2 = user input
 * retireAge = input2 but as an int
 * timeLeft = retire age - current age
 * get current year from java.util.Year
 * add timeLeft to current year to get retire year
 */

public class Solution06 {
    private static final Scanner input = new Scanner(System.in);
    private static int currentAge;
    private static int retireAge;
    private static int timeLeft;
    private static final int CURRENT_YEAR = Year.now().getValue();
    private static int retireYear;

    public static void getCurrentAge() {
        System.out.println("What is your current age?");
        String input1 = input.nextLine();
        currentAge = Integer.parseInt(input1);
    }

    public static void getRetireAge() {
        System.out.println("What age would you like to retire?");
        String input2 = input.nextLine();
        retireAge = Integer.parseInt(input2);
    }

    public static void calculations(int retireAge, int currentAge) {
        timeLeft = retireAge - currentAge;
        retireYear = CURRENT_YEAR + timeLeft;
    }

    public static void main(String[] args) {
        getCurrentAge();
        getRetireAge();
        calculations(retireAge, currentAge);
        System.out.println("You have " + timeLeft + " years left until you can retire.");
        System.out.println("It's " + CURRENT_YEAR + " so you can retire in " + retireYear + ".");
    }
}

