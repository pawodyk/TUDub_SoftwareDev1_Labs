
/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written on:  08/10/18
 * Function:    
 *      Prompt user for two integer numbers
 *      Print remainder of the two numbers
 */

import java.io.IOException;
import java.util.Scanner;

class P2Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.println("Please insert two integer numbers");
        System.out.println("Enter number one");
        number1 = input.nextInt();
        System.out.println("Enter number two");
        number2 = input.nextInt();

        System.out.println("The remainder of division of " + number1 + " and " + number2 + " is: ");
        System.out.println(number1 % number2);

        input.close();
    }
}
