
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	03/12/18 
 * Function:
 *      takes the radius of the circle
 * 		calculate the area of a circle and return the result to the user
 */

import java.util.Scanner;

public class L10CircleArea{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad;

        System.out.println("Please enter the number for radius");

        rad = sc.nextDouble();

        System.out.println("The area of circle: " + CalcCircle(rad));

        sc.close();
    }

    public static double CalcCircle(double r){
        
        return Math.PI * r * 2;
    }

}