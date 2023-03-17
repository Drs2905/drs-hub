import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class StarApplet extends Applet
{
int [] pentagonX = {260,498,407,113,22};
int [] pentagonY = {10,183,462,462,183};
int [] starX = {260,407,22,498,113,260};
int [] starY = {10,462,183,183,462,10};

public void paint(Graphics g)
{
super.paint(g);
g.setColor(Color.pink);
g.fillPolygon(pentagonX,pentagonY,5);
g.setColor(Color.pink);
g.drawPolygon(pentagonX,pentagonY,5);
g.setColor(Color.black);
g.drawPolyline(starX,starY,6);
}
}

/* <applet code = "StarApplet.class" width="500" height="500">
</applet>
*/

