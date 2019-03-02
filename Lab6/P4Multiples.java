/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	05/12/18 
 * Function:
 *      Print multiples of 5 less than a 100
 */

public class P4Multiples {

    public static void main(String[] args) {
        for(int i = 5; i < 100; i+=5){
            System.out.println(i);
        }

        /*
        //Alternative solution
        for (int i = 1; i < 100; i++) {
            if (i%5 ==0) {
                System.out.println(i);
            }
        }
        */
    }
}