/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variable*/
        int length;

        /*Prompting for an input string*/
        System.out.println("What is the input string?");
        String inputString = scan.nextLine();

        length = inputString.length();

        /*Displaying input string along with number of characters*/
        System.out.println(inputString +" has " +length +" characters.");
    }
}
