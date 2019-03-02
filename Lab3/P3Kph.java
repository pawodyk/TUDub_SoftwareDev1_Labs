/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written On:  08/10/18
 * Function:    
 *      Input speed in kilometers per hour
 *      Calculate the speed to miles per hour
 */

import java.util.Scanner;

class P3Kph{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kmPerHours, mPerHours;

        System.out.println("Please enter speed in kilometers per hour you would like to conver to miles per hour");
        kmPerHours = input.nextDouble();

        mPerHours = kmPerHours / 10 * 6;

        System.out.println(kmPerHours + " kmph, is equals to " + mPerHours + " mph");

        input.close();
    }
}

