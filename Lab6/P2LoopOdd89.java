/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	05/12/18 
 * Function:
 *      Prints all odd numbers from 20 to 1 using For loop
 */

public class P2LoopOdd89 {
    public static void main(String[] args) {
        for(int i = 20; i>=1; i--){
            if (i%2 == 1) {
                System.out.println("number: " + i);
            }
        }
    }
}