
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	19/11/18 
 * Function:
 * 		Application prompt the user to enter number
 *      Then it pass the input to the method 
 *      Method print the String "Happy Birthday" n times, where n is user input
 */

import java.util.Scanner;

public class L9HBntimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter number of iterations:");
        num = sc.nextInt();
        printHB(num);

        sc.close();
    }

    private static void printHB(int iterations){
        for (int i = 0; i < iterations; i++) {
            System.out.println("Happy Birthday");
        }
    }

}