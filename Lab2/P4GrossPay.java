/** Author:	Pawel Wodyk
  * ID:		B00122935
  * Date:	01/10/18
  *	Program Descrition:
  *		Ask user to input number of hours and the hourly pay.
  *		Calculate the payment.
  */


import java.util.Scanner;

class P4GrossPay{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		double hours, rate, payment;

		System.out.println("please enter the number of hours");
		hours = input.nextDouble();

		System.out.println("please enter the hourly rate");
		rate = input.nextDouble();

		payment = Math.round(hours * rate * 100.0) /100.0 ; 	// this code round up the earnings to the cent
		System.out.printf("Payment: %,1.2f" ,  payment);	// this code use printf to display the amount in proper format for euro ie. 0.00
	}
}