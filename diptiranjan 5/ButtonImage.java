import java.awt.Color;
import java.awt.*;
import java.awt.event.*; 
import java.applet.*;
import javax.swing. ImageIcon; 
/* 
<applet code="ButtonDemoText" width=250 height=150>
</applet>
*/
public class ButtonImage extends Applet implements ActionListener {
Button yes, no, maybe;
private Object icon;
public void init() {
yes= new Button("Yes"); no= new Button("No");
maybe = new Button("Undecided");
ImageIcon icon=new ImageIcon( "C:/Users/LENOVO/Desktop/car image.jpeg");
add (yes);
add(no);
add(maybe);
yes.addActionListener(this); no.addActionListener(this);
maybe.addActionListener(this);
}
public void actionPerformed (ActionEvent ae) { String str = ae.getActionCommand();
if(str.equals("Yes")) {
icon = ( "C:/Users/LENOVO/Desktop/car image.jpeg");
} else if(str.equals("No")) {
icon = ( "C:/Users/LENOVO/Desktop/car image.jpeg");
} else {
icon = ( "C:/Users/LENOVO/Desktop/car image.jpeg");
}
repaint();
}
public void paint (Graphics g) {
}
}
