/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * declare quantity, price, subtotal, tax, and totalPrice variables
 * declare taxRate final variable
 * use a for loop to get the values for 3 separate items
 * at the end of the loop add the total for that item to subtotal, then go to next item
 *      prompt the user for price and quantity
 *      calculatePrice method
 *          add to subtotal
 *      taxCalculation method
 *      getTotalPrice method
 * tax = subtotal * taxRate
 * totalPrice = subtotal + tax
 *
 */
public class Solution10 {
    private static final Scanner input = new Scanner(System.in);
    private static double subtotal = 0.00;
    private double tax;
    private double totalPrice;
    private static final double TAX_RATE = 0.055;


    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        userInput();
        System.out.printf("Subtotal: $%.2f", subtotal);

        solution.tax = solution.taxCalculation(subtotal);
        System.out.printf("%nTax: $%.2f", solution.tax);

        solution.totalPrice = solution.getTotalPrice();
        System.out.printf("%nTotal: $%.2f", solution.totalPrice);


    }

    public static void userInput() {
        for (int i = 1; i <= 3; i++) {
            System.out.printf("What is the price of item %d: ", i);
            String input1 = input.nextLine();
            int price = Integer.parseInt(input1);

            System.out.printf("What is the quantity of item %d: ", i);
            String input2 = input.nextLine();
            int quantity = Integer.parseInt(input2);

            calculatePrice(price, quantity);
        }

    }
    public static void calculatePrice(int price, int quantity) {
        subtotal += (price * quantity);
    }

    public double taxCalculation(double subtotal){
        tax = subtotal * TAX_RATE;
        return tax;

    }

    public double getTotalPrice(){
        totalPrice = subtotal + tax;
        return totalPrice;
    }
}
