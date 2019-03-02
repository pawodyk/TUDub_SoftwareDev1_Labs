/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written on:  15/10/18
 * Function:
 *      Takes the numeric input between 1 and 12
 *      Output the correct Month name
 */

import java.util.Scanner;

public class P4Month{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month;


        System.out.println("Please enter the Month number (between 1 and 12)");
        month = input.nextInt();

        switch(month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jan");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("There are only 12 months");
        }
        
        input.close();
    }
}