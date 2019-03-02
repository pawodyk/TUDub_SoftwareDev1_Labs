/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Date:        08/10/18
 * Function:    
 *      Input age
 *      Check is the age above 65
 *      If yes output "you are eligible for pension"
 *      Otherwise no output
 */

import java.util.Scanner;

class P5Pension{
    public static void main(String[] args) {
        int age;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the pension eligibility software\n" + 
                            "please enter your age:");
        age = input.nextInt();

        // I checked for age for: over 64, between 64 and 0, otherwise the output is negative and i advise user about it
        if (age > 64){
            System.out.println("You are eligible for a pension");

        }else if(age < 65 && age >= 0){
            System.out.println();
        } else {
            System.out.println("Sorry the number you have entered is negative number, please enter correct age");
        }
        
        input.close();
    
    }
}

