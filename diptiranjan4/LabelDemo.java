import java.applet.*;
import java.awt.*; 
import java.awt.event.*;
public class LabelDemo extends Applet
{
public void init()
{
setBackground (Color.green); 
setForeground (Color.black);
Label l1 = new Label("am ");
Label l2 = new Label("studying mca");
add (l1); 
add (l2);
} 
public void paint (Graphics g)
{
g.drawString("amity", 100, 100);
} 
}
/*
<html>
<body> 
<applet code="LabelDemo.class" width="500" height="500">
</applet>
</body>
</html>
*/