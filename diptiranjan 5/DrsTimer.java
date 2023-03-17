import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DrsTimer {
   
JTextField jTextField1 = null; Timer timer = null;
int hour = 0; int min = 0;
int sec = 0; 
public DrsTimer()
{
//shifted the initialization code to the constructor 
JFrame f = new JFrame("Timer Test");
ActionListener updateListener = new MyUpdateListener(); 
//somewhat an alternative to thread.sleep()
//1000 is the 1 sec period for update
timer = new Timer(1000, updateListener);
jTextField1 = new JTextField();
jTextField1.setBounds (50, 50, 150, 20); 
JButton b = new JButton("Start");
b.setBounds (50, 100, 95, 30);
b.addActionListener(new MyButtonListener());
f.add(b);
f.add(jTextField1);
f.setSize(400, 400);
f.setLayout(null); f.setVisible(true);
f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
} 
private void updateTextbox (String str) {
System.out.println(str);
jTextField1.setText(str); 
}
class MyButtonListener implements ActionListener
{
public void actionPerformed (ActionEvent event) 
{
System.out.println("Entered start button event handler"); 
//your code for reading the values from combos
// then set the member variables hour, min and sec

hour = 0; min = 0;
sec = 15;
timer.start();
}
} 
class MyUpdateListener implements ActionListener
{
    public void actionPerformed (ActionEvent event) {
        if (hour == 0 && min == 0 && sec == 0)
        {
    
    updateTextbox("The time is up!"); 
    timer.stop();
    } 
    else
    {
    
    //display tweak needed for leading zeros 
    updateTextbox(hour +":"+min + ":" + sec); 
    //reduce by 1 sec 
    sec--;
    if (sec == -1 && min == 0 && hour > 0) 
    {
    hour--;
    min = 59; 
    sec = 59;
    } 
    else if (sec == -1 && min > 0)
    { 
        min--;
        sec = 59;
    }
    }
}
} 

    public static void main(String[] args) {
     SwingUtilities.invokeLater( 
        new Runnable(){
            @Override 
            public void run()
        {
    new DrsTimer();
        }
    }
    );
}
}
    



    
   
