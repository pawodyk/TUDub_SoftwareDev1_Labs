
/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written on:  15/10/18
 * Function:
 *      Ask user what type of driving licence they have full or provisional
 *      If they have provisional license print that they must have a fully qualified driver to travel with them.
 *      For Drivers with a full license print you can drive alone
 */

import java.util.Scanner;

class P1Drive{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        

        
        
        System.out.println("Do you have full driving licence or provisional? \n");

        String answer = input.nextLine().trim();

        if(answer.equalsIgnoreCase("full")){ 
            System.out.println("You can drive alone");
        }else if(answer.equalsIgnoreCase("provisional") || answer.equalsIgnoreCase("learner")){
            System.out.println("You must have a fully qualified driver to travel with you");
        }else {
            System.out.println("wrong input");
        }

        input.close();
    }
}