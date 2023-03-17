import java .awt.*;
import javax.swing.*;
public class GridLayoutExample1{

JFrame frameObj;

// constructor 
GridLayoutExample1()
{ 
    frameObj = new JFrame();
   
// creating 9 buttons 
JButton btn1 = new JButton("1");
btn1.setBackground(Color.black);
JButton btn2 = new JButton("2");
JButton btn3 = new JButton("3");
btn3.setBackground(Color.black);
JButton btn4 = new JButton("4"); 
JButton btn5 = new JButton("5");
btn5.setBackground(Color.black);
JButton btn6 = new JButton ("6");
JButton btn7 = new JButton("7");
btn7.setBackground(Color.black);
JButton btn8 = new JButton("8");
JButton btn9= new JButton("9");
btn9.setBackground(Color.black);
// adding buttons to the frame
// since, we are using the parameterless constructor, therefore;
// the number of columns is equal to the number of buttons we 
// are adding to the frame. The row count remains one.
frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);
frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6); 
frameObj.add(btn7); frameObj.add(btn8); frameObj.add(btn9); 
// setting the grid layout
// a 3 3 grid is created with the horizontal gap 20 
// and vertical gap 25
frameObj.setLayout(new GridLayout(3, 3,25,25));
frameObj.setSize(500, 500);
frameObj.setVisible(true); 
}
// main method 
public static void main(String args[]){
new GridLayoutExample1();
}
}