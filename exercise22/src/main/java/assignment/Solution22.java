package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Gabriel Martin
 */
import java.util.Scanner;

/*
 * firstNum = user input for the first number
 * secondNum = user input for the second number
 * thirdNum = user input for th third number
 * take any combination of 2 numbers to see if they are the same
 *      if they are the same exit the program
 * use a combination of if and else statements to find the largest number
 * store the number in a temporary variable
 * print out the value of the temporary variable
 */
public class Solution22 {
    private int firstNum;
    private int secondNum;
    private int thirdNum;
    private int temp;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution22 solution = new Solution22();

        solution.firstNum = solution.userInputFirst();
        solution.secondNum = solution.userInputSecond();
        solution.thirdNum = solution.userInputThird();

        if(solution.firstNum == solution.secondNum || solution.firstNum == solution.thirdNum || solution.thirdNum == solution.secondNum ) {
            System.out.println("Two or more inputs are the same, please enter 3 different numbers.");
            System.exit(0);
        }
        else {
            if(solution.firstNum > solution.secondNum) {
                if(solution.firstNum > solution.thirdNum) {
                    solution.temp = solution.firstNum;
                } else {
                    solution.temp = solution.thirdNum;
                }
            }

            else if(solution.secondNum > solution.thirdNum) {
                    solution.temp = solution.secondNum;
            }

            else {
                solution.temp = solution.thirdNum;
            }
        }

        System.out.printf("The largest number is: %d", solution.temp);
    }

    public int userInputFirst(){
        System.out.println("Enter the first number: ");
        return input.nextInt();
    }

    public int userInputSecond(){
        System.out.println("Enter the second number: ");
        return input.nextInt();
    }

    public int userInputThird(){
        System.out.println("Enter the third number: ");
        return input.nextInt();
    }
}
