
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	03/12/18 
 * Function:
 * 		Takes two integers from the user and display the smallest
 *      Calles Method Minimum that returns the smaller of these two numbers
 */

import java.awt.*;
import java.awt.event.*;

public class L10Minimum extends Frame implements ActionListener{

    Label lblNumOne, lblNumTwo, lblInstructions;
    TextField txfNumOne, txfNumTwo;

    public L10Minimum(){
        setLayout(new FlowLayout());
        setSize(300,400);
        setVisible(true);

        lblNumOne = new Label("Enter First Number");
        lblNumTwo = new Label("Enter Second Number");
        lblInstructions = new Label("Determine which number is smaller");

        txfNumOne = new TextField("", 0);
        txfNumTwo = new TextField("", 0);

        add(lblInstructions);
        add(lblNumOne);
        add(txfNumOne);
        add(lblNumTwo);
        add(txfNumTwo);

        txfNumTwo.addActionListener(this);
    }

    public static void main(String[] args) {
        new L10Minimum();
    }

    public void actionPerformed(ActionEvent e){

        lblInstructions.setText(minimum());
        txfNumOne.setText("");
        txfNumTwo.setText("");
        
    }

    public String minimum(){
        int x, y;
        String one = txfNumOne.getText();
        String two = txfNumTwo.getText();
        try {
            x = Integer.parseInt(one);
            y = Integer.parseInt(two);

            return "The smaller number is: " + Math.min(x, y);

        } catch (NumberFormatException NumFormEx) {
            return "you did not enter two numbers";
        }
    }

    

}