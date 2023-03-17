import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class mouseclicked1 extends Frame implements MouseListener
{
mouseclicked1()
{
addMouseListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void mouseClicked(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.red);
g.fillRect(e.getX(),e.getY(),50,50);
}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mousePressed(MouseEvent e){}
public void mouseReleased(MouseEvent e){}

public static void main(String[] args)
{
new mouseclicked1();
}
}
/*
<applet code="mouseclicked1.class" width=500 height=500>
</applet>
*/

