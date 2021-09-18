package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;
/*
 * declare all variables
 * make conversion factor a constant using final
 * create method to get length from the user
 * create method to get width from the user
 * areaFeet = width * length
 * areaMeters = areaFeet * conversion factor
 *
 */
public class Solution07 {
    private static final Scanner input = new Scanner(System.in);
    private static int length;
    private static int width;
    private static int areaFeet;
    private static double areaMeters;
    private static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {
        length = getLength();
        width = getWidth();
        areaFeet = getAreaFeet(length, width);
        areaMeters = getAreaMeters(areaFeet);
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is \n" + areaFeet + " square feet\n"  + areaMeters + " square meters");
    }

    public static int getLength() {
        System.out.println("What is the length of the room in feet?");
        String input1 = input.nextLine();
        length = Integer.parseInt(input1);
        return length;
    }

    public static int getWidth() {
        System.out.println("What is the width of the room in feet?");
        String input2 = input.nextLine();
        width = Integer.parseInt(input2);
        return width;
    }

    public static int getAreaFeet(int length, int width) {
        areaFeet = length * width;
        return areaFeet;
    }

    public static double getAreaMeters(int areaFeet) {
        areaMeters = areaFeet * CONVERSION_FACTOR;
        return areaMeters;
    }
}
