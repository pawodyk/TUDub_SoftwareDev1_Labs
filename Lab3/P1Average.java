/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written on:  08/10/18
 * Function:
 *      Input sales figures monday to friday
 *      Calculate avarage
 */

import java.util.Scanner;

class P1Average{
    public static void main(String[] args) {
        double[] amounts = new double[5];   //creates array holding sales values in the form of double for each day
        String[] days = {"Monday", "Tuesday", "Wednsday", "Thursday", "Friday"};    //creates String array holding names of the days of the week
        final String EURO = "\u20AC";   //holds constatn value for Euro sign --> unfortunatlly not displaying due to windows command line not using unicode encoding UTF-8 as I found out later on StackOverflow forum 

        double output = 0.0;    //declaration and initialization of output variable

        Scanner input = new Scanner(System.in); // declaring scanner instance - input

        //this code itterates through the array asking user to input the value for each day. Beacause it use nextDouble() function you can enter it all in the row or by pressing ENTER after each value. it will tak only 5 values. 
        System.out.println("Please enter the amount for each day (mon, tue, wed, thu, fri) followed by [ENTER]");
        for (int i=0; i < amounts.length; i++){
            amounts[i] = input.nextDouble();
        }

        System.out.println("\n**************************************\n");

        //this code iterates through both array printing day of the week and the amount
        System.out.println("The amount you have entered are: " );
        for(int i = 0; i < amounts.length; i++){
            System.out.printf("%s:  %,1.2f%n", days[i], amounts[i]);
        }

        //this for loop itterates throught each value and add it to the total
        for (double doub : amounts){
            output += doub;
        }

        System.out.println("**************************************");
        System.out.printf("The avarage amount per day is: \t%s%,1.2f%n", EURO, round(output/amounts.length)); // output the amount in correct format.
        //System.out.printf("The total amount for this week is:\t %s%,1.2f%n", EURO, round(output / amounts.length)); // prints the total amount

        input.close();

    }

    //this class rounds up amount of double value and return it as a double
    public static double round(double amount){

        Double temp = 0.0;
        temp = Math.round(amount * 100.0) /100.0 ;
        return temp;
    }
}

