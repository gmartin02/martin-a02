package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * declare people and totalSlices as a class variable since only those two need to be accessed by methods
 * get user input using a scanner (people, pizzas, slicesPerPizza)
 * totalSlices = pizza * slicesPerPizza
 * slicesPerPerson = totalSlices/people (left as an int that is rounded down)
 * slicesLeftover = totalSlices % people to get the remaining slices
 * print out the results for the user
 */
public class Solution08 {
    private static final Scanner input = new Scanner(System.in);
    private static int people;
    private static int totalSlices;

    public static void main(String[] args) {
        getUserInput();
        getSlicesPerPerson(totalSlices, people);
        getSlicesLeftover(totalSlices, people);

    }

    public static void getUserInput() {
        System.out.println("How many people?");
        String input1 = input.nextLine();
        people = Integer.parseInt(input1);

        System.out.println("How many pizzas?");
        String input2 = input.nextLine();
        int pizzas = Integer.parseInt(input2);

        System.out.println("How many slices per pizza?");
        String input3 = input.nextLine();
        int slicesPerPizza = Integer.parseInt(input3);

        totalSlices = getTotalSlices(pizzas, slicesPerPizza);
        System.out.println(people + " people with " + pizzas + " pizzas " + "(" + totalSlices + " slices)");
    }

    public static int getTotalSlices(int pizzas, int slicesPerPizza) {
        totalSlices = pizzas * slicesPerPizza;
        return totalSlices;
    }

    public static void getSlicesPerPerson(int totalSlices, int people) {
        int slicesPerPerson = totalSlices / people;
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
    }

    public static void getSlicesLeftover(int totalSlices, int people) {
        int slicesLeftover = totalSlices % people;
        System.out.println("There are " + slicesLeftover + " leftover pieces");
    }
}
