import java.awt.Color; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing. ImageIcon; 
public class MyFrame1 extends JFrame implements KeyListener{ 
JLabel label; 
ImageIcon icon=new ImageIcon( "C:/Users/LENOVO/Desktop/car image.jpeg"); 
MyFrame1(){ 
this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
this.setSize(400,400); 
this.setLayout(null); 
this.addKeyListener(this); 
//icon = new ImageIcon("C:/Users/LENOVO/Desktop/car image.jpeg"); 
label = new JLabel(); 
label.setBounds(100, 100, 600, 600); 
label.setIcon(icon);
 //label. setBackground (Color.red); 
//label.setOpaque (true);
this.getContentPane().setBackground (Color.white); 
this.add (label); 
this.setVisible(true); 
}
public void keyTyped (KeyEvent e) { 
//keyTyped Invoked when a key is typed. Uses KeyChar,char output
switch(e.getKeyChar()) { 
case 'a': label.setLocation (label.getX()-10,label.getY()); 
break; 
case 'w': label.setLocation (label.getX(),label.getY()-10) ;
break; 
case 's': label.setLocation(label. getX(),label.getY()+10);
break; 
case 'd': label.setLocation (label.getX()+10,label.getY() ); 
break; 
		}
	}
public void keyPressed (KeyEvent e) { 
//keyPressed = Invoked when a physical key is pressed down.Uses KeyCode; int output
switch(e.getKeyCode()) {  
case 37: label.setLocation(label.getX()-10, label.getY() ); 
break; 
case 38: label.setLocation(label.getX(),label.getY()-10); 
break; 
case 39: label.setLocation (label.getX()+10,label.getY()); 
break; 
case 40: label.setLocation (label.getX(),label.getY()+10); 
break; 
		}
}
public void keyReleased (KeyEvent e) { 
//keyReleased called whenever a button is released 
System.out.println("You released key char:  "+ e.getKeyChar());
System.out.println( "You released key code: "+e.getKeyCode());
		}
	}