import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter; 
import java.awt.event.*;
import java.awt.Point;
import javax.swing.ImageIcon; 
import javax.swing.JPanel;
public class DragPanel extends JPanel{
ImageIcon image = new ImageIcon("C:/Users/LENOVO/Desktop/apple.jpeg"); 
final int WIDTH = image.getIconWidth(); 
final int HEIGHT = image.getIconHeight(); 
Point imageCorner;
Point prevpt;
DragPanel(){
imageCorner = new Point (0,0);
ClickListener clickListener = new ClickListener(); 
DragListener dragListener = new DragListener(); 
this.addMouseListener(clickListener);
this.addMouseMotionListener(dragListener);
}
public void paintComponent(Graphics g) {
super.paintComponent(g); 
image.paintIcon(this, g, (int)imageCorner.getX(),(int)imageCorner.getY());
}
private class ClickListener extends MouseAdapter{
public void mousePressed(MouseEvent e) { 
    prevpt = e.getPoint();
}
}

private class DragListener extends MouseMotionAdapter{
public void mouseDragged (MouseEvent e) {
Point currentPt = e.getPoint();
imageCorner.translate(
    (int)(currentPt.getX() - prevpt.getX()), (int)(currentPt.getY() - prevpt.getY())
);

prevpt = currentPt; 
repaint();

}
}
}