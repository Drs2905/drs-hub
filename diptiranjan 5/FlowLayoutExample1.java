import java.awt.*; 
import javax.swing.*;
public class FlowLayoutExample1{ 
    JFrame frameObj;

// constructor 
FlowLayoutExample1(){
// creating a frame object 
frameObj = new JFrame();
// creating the buttons 
JButton b1 = new JButton("1");
b1.setBackground(Color.black);
JButton b2 = new JButton("2");
b2.setBackground(Color.white);
JButton b3 = new JButton("3");
b3.setBackground(Color.green);
JButton b4 = new JButton("4");
b4.setBackground(Color.blue); 
JButton b5 = new JButton("5");
b5.setBackground(Color.pink);
JButton b6 = new JButton("6");
b6.setBackground(Color.black); 
JButton b7 = new JButton("7");
b7.setBackground(Color.green);
JButton b8 = new JButton("8");
b8.setBackground(Color.blue);
JButton b9 = new JButton ("9");
b9.setBackground(Color.yellow);
JButton b10 = new JButton ("10");
b10.setBackground(Color.red);
// adding the buttons to frame 
frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4); frameObj.add(b5); 
frameObj.add(b6); frameObj.add(b7); frameObj.add(b8); frameObj.add(b9);frameObj.add(b9); frameObj.add(b10);
// parameterized constructor is used 
// where alignment is left
// horizontal gap is 20 units and vertical gap is 25 units. 
frameObj.setLayout(new FlowLayout(FlowLayout.LEFT,20, 25));
frameObj.setSize(300, 300); 
frameObj.setVisible(true);
frameObj.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}
// main method

public static void main(String args[]){

new FlowLayoutExample1();
}
}