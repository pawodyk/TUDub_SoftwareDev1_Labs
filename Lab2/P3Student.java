/** Author:	Pawel Wodyk
  * ID:		B00122935
  * Date:	01/10/18
  *	Program Descrition:
  *		Take  imput for number of students in Group A and Group B.
  * 	Output the total number of students
  */


import java.util.Scanner;

class P3Student{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		int groupA, groupB, total = 0;

		System.out.println("Please enter the number of students in the group A");

		groupA = input.nextInt();

		System.out.println("Please enter the number of students in the group B");

		groupB = input.nextInt();

		total = groupA + groupB;

		System.out.println("\nThank you for entering the number of students in both groups");
		System.out.println("The total number of students is " + total);
	}
}