
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	26/11/18 
 * Function:
 * 		The program reads a list of 15 numbers 
 *      next it prints only values that are greater than the last number on the list
 */

import java.util.Scanner;

public class L9GreatCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[15];

        System.out.println("Please enter " + numbers.length + " numbers.");

        for (int x = 0; x < numbers.length; x++) {
            System.out.println("enter number:");
            numbers[x] = sc.nextInt();
        }

        System.out.println("\nYour numbers are: ");
        for (int y = 0; y < numbers.length; y++) {
            if (y == 0) {
                System.out.println(numbers[0] + ">0");
            } else{
                if (numbers[y] > numbers[y - 1]){
                    System.out.println(numbers[y] + ">" + numbers[y - 1]);
                }
            } 
        }
        sc.close();
    }
}