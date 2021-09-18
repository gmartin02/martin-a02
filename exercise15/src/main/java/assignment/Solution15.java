package assignment;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Gabriel Martin
 */

import java.util.Scanner;

/*
 * ask the user to enter a username
 * ask the user for the password
 * if userPassword == systemPassword
 *      allow them in
 *      print a welcome statement using the username
 * else
 *      keep them away
 */

public class Solution15 {
    private static final Scanner input = new Scanner(System.in);
    private String userName;
    private String userPassword;
    private static final String SYSTEM_PASSWORD = "supersecretpassword";


    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        solution.userName = solution.userInputUserName();
        solution.userPassword = solution.userInputUserPassword();

        if(solution.checkPasswords(solution.userPassword, SYSTEM_PASSWORD)){
            System.out.println("Access Granted! Welcome " + solution.userName);
        } else {
            System.out.println("Access Denied. Get out of my sight.");
        }
    }

    public String userInputUserName(){
        System.out.println("Enter a username: ");
        return input.next();
    }

    public String userInputUserPassword(){
        System.out.println("Enter a password: ");
        return input.next();
    }

    public boolean checkPasswords(String userPassword, String systemPassword){
        return userPassword.equals(systemPassword);
    }
}
