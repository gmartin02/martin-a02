/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Gabriel Martin
 */

package assignment;

import java.util.Locale;
import java.util.Scanner;

/*
 * get the unit of the input temperature from the user
 * no matter the input use .toUpperCase to make sure lowercase values are included after they are changed
 * if of original temp unit = "F"
 *      tell them to input the temp in celsius and store it in 'temperature'
 * if unit of original temp = "C"
 *      tell them to input the temp in fahrenheit and store it in 'temperature'
 * pass 'temperature to the correct function if unit input is "C" or "F"
 * if of original temp unit = "F"
 *      final temp = (temperature * 9.0/5.0) + 32.0
 * if unit of original temp = "C"
 *      final temp = (temperature-32.0) * 5.0/9.0
 * print out the final temp followed by the right unit
 *
 */
public class Solution18 {
    private static final Scanner input = new Scanner(System.in);
    private String tempUnit;
    private int temperature;
    private double newTemp;

    public static void main(String[] args) {
        Solution18 solution = new Solution18();
        solution.tempUnit = solution.userInputTempUnit();

        solution.temperature = solution.userInputCurrentTemp(solution.tempUnit);

        if(solution.tempUnit.equals("F")) {
            solution.newTemp = solution.ctoF(solution.temperature);
            System.out.printf("The temperature is %.2f Fahrenheit", solution.newTemp);
        } else if (solution.tempUnit.equals("C")){
            solution.newTemp =solution.ftoC(solution.temperature);
            System.out.printf("The temperature is %.2f Celsius", solution.newTemp);
        } else {
            System.out.println("Invalid input please either put F or C.");
        }
    }

    public String userInputTempUnit() {
        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        String temp = input.next();
        return temp.toUpperCase(Locale.ROOT);
    }

    public int userInputCurrentTemp(String tempUnit) {
        if(tempUnit.equals("C")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            return input.nextInt();
        } else if(tempUnit.equals("F")) {
            System.out.println("Please enter the temperature in Celsius: ");
            return input.nextInt();
        }
        return 0;
    }

    public double ctoF(int temperature) {
        return (temperature * 9.0/5.0) + 32.0;
    }

    public double ftoC(int temperature) {
        return (temperature-32.0) * 5.0/9.0;
    }
}
