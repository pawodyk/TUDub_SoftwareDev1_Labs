
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	26/11/18 
 * Function:
 *  This applet performs 4 opperations:
 * 		Compute the sum of the elements in the array.
 *      Compute the product of the elements in the array.
 *      Print only the multiples of 3 in the array.
 *      Compute the frequency of the number 5 in the array. 
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 * L9ArraySum
 */
public class L9ArraySum extends Applet {
    
    int intArray[] = { 2, 4, 6, 9, 5, 4, 5, 7, 12, 15, 21, 32, 45, 5, 6, 7, 12 };

    public void init() {
        
    }

    public void paint(Graphics g) {
        g.drawString(print(intArray), 20, 10);
        g.drawString(sum(intArray), 20, 40);
        g.drawString(product(intArray), 20, 60);
        g.drawString(mult3(intArray), 20, 80);
        g.drawString(freq5(intArray), 20, 100);
    }

    public static String print(int[] numbs) {
        String result = "The set is: <";
        for (int x : numbs) {
            result = result.concat(String.valueOf(x) + " ");
        }
        result = result.concat(">");
        return result;
    }

    public static String sum(int[] numbs) {
        int result = 0;
        for (int s : numbs) {
            result += s;
        }
        return "Sum of numbers is: " + result;
    }

    public static String product(int[] numbs) {
        long result = 1;
        for (int p : numbs) {
            result *= p;
        }
        return "Product of numbers is: " + result;
    }

    public static String mult3(int[] numbs) {
        String result = "The multiples of number 3 in the list are: ";
        for (int m : numbs) {
            if (m%3==0) {
                result = result.concat(String.valueOf(m) + "; ");
            }
        }
        return result;
    }

    public static String freq5(int[] numbs) {
        int i = 0, result = 0;
        while(numbs.length > i){
            if (numbs[i] == 5) {
                result++;
            }
            i++;
        }
        return "The number 5 occuress " + result + " times in the set.";
    }
}