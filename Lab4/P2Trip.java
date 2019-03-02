/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written on:  15/10/18
 * Function:
 *      
 */

import java.util.Scanner;

public class P2Trip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int students = 0;
        students = input.nextInt();

        System.out.println("You have entered " + students + " students. \nYou will need: " + (students / 5)+ " cars and there will be " + (students % 5) + " students left"); 

        input.close();
    }
}