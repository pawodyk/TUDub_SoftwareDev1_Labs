
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	26/11/18 
 * Function:
 * 		The program reads a list of 15 numbers 
 *      next it prints only values that are greater than the last number on the list
 *      Alternative solution to the problem
 */

import java.util.Scanner;

public class L9GreatCheckAlt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        int hiNum;

        System.out.println("Please enter " + numbers.length + " numbers.");

        for (int x = 0; x < numbers.length; x++) {
            System.out.println("enter number:");
            numbers[x] = sc.nextInt();
        }

        hiNum = numbers[0];

        System.out.print("\nYour numbers are: ");
        for (int y = 0; y < numbers.length; y++) {
            if (numbers[y] > hiNum || y == 0) {
                hiNum = numbers[y];
                System.out.print(numbers[y] + "; ");
            } else {
                System.out.print("_; ");
            }
        }
        sc.close();
    }
}