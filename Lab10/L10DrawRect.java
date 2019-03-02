
/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	03/12/18 
 * Function:
 * 		Ask user to enter four integers representing the upper-left coordinates, the width and the height of a rectangle
 *      Uses Graphics method drawRect to draw a rectangle using the values entered by the user. 
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class L10DrawRect extends Frame implements ActionListener {

    Label lblNum1, lblNum2, lblNum3, lblNum4;
    TextField txfNum1, txfNum2, txfNum3, txfNum4;
    int x = 0, y = 0, w = 0, h = 0;

    public L10DrawRect() {
        setLayout(new FlowLayout());
        setSize(600, 400);
        setVisible(true);

        lblNum1 = new Label("x coordinate");
        lblNum2 = new Label("y coordinate");
        lblNum3 = new Label("Width");
        lblNum4 = new Label("Height");

        txfNum1 = new TextField(5);
        txfNum2 = new TextField(5);
        txfNum3 = new TextField(5);
        txfNum4 = new TextField(5);

        add(lblNum1);
        add(txfNum1);
        add(lblNum2);
        add(txfNum2);
        add(lblNum3);
        add(txfNum3);
        add(lblNum4);
        add(txfNum4);

        txfNum4.addActionListener(this);
    }

    public static void main(String[] args) {
        new L10DrawRect();
    }

    public void actionPerformed(ActionEvent e) {

        x = Integer.parseInt(txfNum1.getText());
        y = Integer.parseInt(txfNum2.getText());
        w = Integer.parseInt(txfNum3.getText());
        h = Integer.parseInt(txfNum4.getText());

        repaint();
    }

    public void paint(Graphics g){
        g.drawRect(x, y, w, h);
    }

}