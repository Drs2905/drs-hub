import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* 
<applet code ="AdapterDemo" width=400 height=300>
</applet>
*/
public class AdapterDemo extends Applet { 
    public void init(){
    addMouseListener(new MyMouseAdapter(this)); 
    addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}
class MyMouseAdapter extends MouseAdapter {
AdapterDemo adapterDemo;
public MyMouseAdapter (AdapterDemo adapterDemo) {
    this.adapterDemo = adapterDemo;
}
public void mouseClicked (MouseEvent me) {
    adapterDemo.showStatus("Mouse clicked");
    String msg ="DIPTI"; 
    adapterDemo.repaint();
        }   
    }
class MyMouseMotionAdapter extends MouseMotionAdapter { 
    AdapterDemo adapterDemo;

public MyMouseMotionAdapter(AdapterDemo adapterDemo) {

this.adapterDemo = adapterDemo;
}
public void mouseDragged (MouseEvent me) { 
    adapterDemo.showStatus("Mouse dragged");
}
}





    

