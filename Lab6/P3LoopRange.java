
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	05/12/18 
 * Function:
 *      Prompts the user to input two values a start value and a finish value. 
 *          Where the first value is the initial / lower value in the range 
 *          The second value is the finish/larger value in the range
 *      Adds up all even numbers between the initial value and the finish value.
 */

import java.util.Scanner;

public class P3LoopRange {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int no1 = 5, no2 = 10, sum = 0;

        System.out.println("Enter first number: ");
        no1 = sc.nextInt();

        System.out.println("Enter Second number(bigger then the first): ");
        no2 = sc.nextInt();

        for (int i = no1; i < (no2 + 1); i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        if(sum!=0)  System.out.println("The sum of even numbers is " + sum);
        else        System.out.println("The second number was higher or equal the first number");

        sc.close();
    } 
}