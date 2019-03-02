/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Date:        08/10/18
 * Function:    Prompt for number of tyres
 *              calculate how many cars can be fitted with a current number of tyres
 *              calculate the remaining number of tires you are left with.
 */

import java.util.Scanner;

class P4Cars{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cars, tyres, tyresRem;

        System.out.println("Please enter the number of tyres in the garage");
        tyres = input.nextInt();
        
        cars = tyres / 4; // calculates the number of cares that can be fitted with the tyres
        tyresRem = tyres % 4; // calculate the remaing tyres

        System.out.println("You can fit " + cars + " cars with tyres and you will have " 
                            + tyresRem + " tyres remaining.");

        input.close();
    }
}

