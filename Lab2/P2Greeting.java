/** Author:	Pawel Wodyk
  * ID:		B00122935
  * Date:	01/10/18
  *	Program Descrition:
  *		Ask user for his/her name, next append the greeting with a user name.
  */


import java.util.Scanner;

class P2Greeting{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		String userName;

		System.out.println("Hello user whats your name?");

		userName = input.next();

		System.out.println("Welcome " + userName + ", nice to meet you!!!");
	}
}