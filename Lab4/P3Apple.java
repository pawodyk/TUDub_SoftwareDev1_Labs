/**Programmer:  Pawel Wodyk
 * StudentID:   B00122935
 * Written on:  15/10/18
 * Function:
 *      calculate the amount you need to pay for apples at the given price
 */

import java.util.Scanner;

public class P3Apple {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numOfApples;
        double amount, price;

        /* Less than 6 apples costs 0.80 euro per apple 
         * From 6 to less than 12 apples costs 0.70 euro per apple 
         * From 12 to less than 20 apples costs 0.60 euro per apple 
         * 20 or more apples costs 0.50 euro per apple
         */

        System.out.println("Please enter the amount of apples you would like to buy");

        numOfApples = input.nextInt();
        //this if statement check is the value correct ie. not less then 0
        if (numOfApples > 0){
            //this if statement check the amount of apples and asign the correct price
            if      (numOfApples < 6)                       price = 0.8;
            else if (numOfApples < 12 && numOfApples >= 6)  price = 0.7;
            else if (numOfApples < 20 && numOfApples >= 12) price = 0.6;
            else                                            price = 0.5;
            
            //calculate the amount to pay
            amount = numOfApples * price;

            //prints the result to the user
            System.out.printf("You have entered %d apples. At this amount the price per apple is %1.2f EUR%n", numOfApples, price);
            System.out.printf("Total amout to pay for %d apples at this price is: %,1.2f EUR %n", numOfApples, amount);

        }else{
            System.out.println("Number of apples entered [" + numOfApples + "] was incorrect\nPlease make sure the amount you have entered is not negative number or 0");
        }

        input.close();
    }

    //this fuction round the amount to the cent and return in the form of double
    public static double format(double amount) {

        Double temp = 0.0;
        temp = Math.round(amount * 100.0) / 100.0;
        return temp
        ;
    }
}