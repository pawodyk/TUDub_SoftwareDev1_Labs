/** Author:	Pawel Wodyk
  * ID:		B00122935
  * Date:	01/10/18
  *	Program Descrition:
  *		Take input from user and display it.
  */


import java.util.Scanner;

class P1Pcs{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		int users;

		System.out.println("please enter the number of computers in your organization");

		users = input.nextInt();

		System.out.println("The number of computers is " + users);
	}
}