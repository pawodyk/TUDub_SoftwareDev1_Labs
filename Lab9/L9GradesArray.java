
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	26/11/18 
 * Function:
 * 		Applet initialises an array called grades with 10 random values
 *      Displais the grade values from the array on the screen using paint method
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

public class L9GradesArray extends Applet {
    
    int[] grades;
    Random rand = new Random();

    public void init() {
        grades = new int[10];
        for(int i = 0; i < grades.length; i++){
            grades[i] = rand.nextInt(100);
        }
    }
    
    public void paint(Graphics g){
        int yposition = 0;
        for (int i = 0; i < grades.length; i++) {
            yposition += 15;
            g.drawString("Student ["+ (i+1) +"] Result :", 20, yposition);
            g.drawString(String.valueOf(grades[i]), 200, yposition);
        }
    }

}