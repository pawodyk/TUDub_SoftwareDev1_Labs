
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	19/11/18 
 * Function:
 * 		Applet prompt user to enter 3 numbers 
 *      Adds the numbers together and display the result using drawString method
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L9addnum extends Applet implements ActionListener {
    Label lblNum1, lblNum2, lblNum3;
    TextField txtNum1, txtNum2, txtNum3;

    int inNum1, inNum2, inNum3;

    public void init() {
        lblNum1 = new Label("Enter first Number");
        add(lblNum1);

        txtNum1 = new TextField(3);
        add(txtNum1);

        lblNum2 = new Label("Enter second Number");
        add(lblNum2);

        txtNum2 = new TextField(3);
        add(txtNum2);

        lblNum3 = new Label("Enter third Number");
        add(lblNum3);

        txtNum3 = new TextField(3);
        add(txtNum3);

        txtNum1.addActionListener(this);
        txtNum2.addActionListener(this);
        txtNum3.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e) {
        inNum1 = Integer.parseInt(txtNum1.getText());
        inNum2 = Integer.parseInt(txtNum2.getText());
        inNum3 = Integer.parseInt(txtNum3.getText());
        repaint();

    }
    
    public void paint(Graphics g){
        g.drawString(String.valueOf(additon(inNum1,inNum2,inNum3)),100,100);
    }


    

    public int additon(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}