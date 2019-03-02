/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	26/11/18 
 * Function:
 * 		An application asks the user to enter 5 numbers
 *      the numbers are stored in an array called numbers
 *      The numbers are then printed to the screen. 
 */

import java.util.Scanner;

public class L9numbersarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter any number:");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("\n#######################\n\nThe numbers you have entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}