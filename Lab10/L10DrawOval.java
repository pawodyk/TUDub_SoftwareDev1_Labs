
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	03/12/18 
 * Function:
 * 		Prompt user to enter five integers representing the upper and left coordinates, the width and the height and a shape of the figure
 *      Uses Graphics method drawRect or drawOval to draw a shape based on the values entered by the user
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class L10DrawOval extends Frame implements ActionListener {

    Label lblNum1, lblNum2, lblNum3, lblNum4, lblDecision;
    TextField txfNum1, txfNum2, txfNum3, txfNum4, txfDecision;
    int x = 0, y = 0, w = 0, h = 0;
    boolean drawRec;

    public L10DrawOval() {
        setLayout(new FlowLayout());
        setSize(600, 400);
        setVisible(true);

        lblNum1 = new Label("x coordinate");
        lblNum2 = new Label("y coordinate");
        lblNum3 = new Label("Width");
        lblNum4 = new Label("Height");
        lblDecision = new Label("1 for Rectangle, 2 for Oval");

        txfNum1 = new TextField(5);
        txfNum2 = new TextField(5);
        txfNum3 = new TextField(5);
        txfNum4 = new TextField(5);
        txfDecision = new TextField(0);

        add(lblNum1);
        add(txfNum1);
        add(lblNum2);
        add(txfNum2);
        add(lblNum3);
        add(txfNum3);
        add(lblNum4);
        add(txfNum4);
        add(lblDecision);
        add(txfDecision);

        txfDecision.addActionListener(this);
    }

    public static void main(String[] args) {
        new L10DrawOval();
    }

    public void actionPerformed(ActionEvent e) {

        x = Integer.parseInt(txfNum1.getText());
        y = Integer.parseInt(txfNum2.getText());
        w = Integer.parseInt(txfNum3.getText());
        h = Integer.parseInt(txfNum4.getText());
        if(txfDecision.getText().equals("1")){
            drawRec = true;
        } else if(txfDecision.getText().equals("2")){
            drawRec = false;
        }

        repaint();
    }

    public void paint(Graphics g) {
        if (drawRec){
            g.drawRect(x, y, w, h);
        }else{
            g.drawOval(x, y, w, h);
        }
        
    }

}