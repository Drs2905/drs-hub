import java.awt.*;    
import java.awt.event.*;    

public class MouseMotion extends MouseMotionAdapter {     
    Frame f;    
 
    MouseMotion() {    
  
        f = new Frame ("Mouse Motion Adapter");    

        f.addMouseMotionListener (this);    
 
        f.setSize (300, 300);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    
 
public void mouseDragged (MouseEvent e) {    

    Graphics g = f.getGraphics();    
 
    g.setColor (Color.green);    
 
    g.fillOval (e.getX(), e.getY(), 20, 20);    
}    
public static void main(String[] args) {    
    new MouseMotion();    
}    
}    
/*
<applet code="MouseMotion.class" width=500 height=500>
</applet>
*/