
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	19/11/18 
 * Function:
 * 		When user enters number the method is called 
 *      calculates the cube of the entered number
 *      the result is returned as the result
 */

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L9cubemethod extends Applet implements ActionListener {
    
    Label lblnumber, lblInst;
    TextField tfnumber;

    int num;

    public void init() {
        lblInst = new Label("Enter first Number");

        tfnumber = new TextField(3);

        lblnumber = new Label("Your number will appear here!");
        
        add(lblInst);
        add(tfnumber);
        add(lblnumber);
        
        
        tfnumber.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        
        num = Integer.parseInt(tfnumber.getText());
        lblnumber.setText(String.valueOf(cube(num)) + " ");
        //repaint();

    }

    public static long cube(int num){
        return num * num * num;
    }

}