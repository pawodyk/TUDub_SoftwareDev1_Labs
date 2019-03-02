/**
 * Programmer: Pawel Wodyk 
 * StudentID: B00122935 
 * Written on: 22/10/18 
 * Function:
 *      Use do while loop to output "Hello World" 10 times
 */

class P1DoWhileHello {
    public static void main(String[] args) {

        int counter = 0;

        do{
            System.out.println("Hello World");
        } while (++counter < 10);
    }
}