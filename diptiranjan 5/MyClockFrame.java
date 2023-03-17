import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class MyClockFrame extends JFrame{
Calendar calendar;
SimpleDateFormat timeFormat;
SimpleDateFormat dayFormat; 
SimpleDateFormat dateFormat;
JLabel timeLabel;
JLabel dayLabel; JLabel dateLabel;
String time;
String day;
String date;

MyClockFrame(){
this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
this.setTitle("My Clock Program");
this.setLayout(new FlowLayout());
this.setSize(350,400); 
this.setResizable(false);
timeFormat = new SimpleDateFormat("hh:mm:ss a");
dayFormat = new SimpleDateFormat("EEEE");
dateFormat = new SimpleDateFormat("dd MMMM, yyyy");

timeLabel = new JLabel();
timeLabel.setFont(new Font("Algerian", Font. PLAIN, 50));
timeLabel.setForeground(new Color (0x00FF00)); 
timeLabel.setBackground (Color.red);
timeLabel.setOpaque (true);

dayLabel = new JLabel();
dayLabel.setFont(new Font("Algerian", Font. PLAIN, 35));

dateLabel = new JLabel();
dateLabel.setFont(new Font("Algerian", Font. PLAIN,30));

this.add(timeLabel);
this.add(dayLabel);
this.add(dateLabel);
this.setVisible(true);
this.setVisible(true);
setTime();
}
public void setTime() {
while(true) { 
    time = timeFormat.format(Calendar.getInstance().getTime()); 
    timeLabel.setText(time);

day = dayFormat.format(Calendar.getInstance().getTime());
dayLabel.setText(day); 

date = dateFormat.format(Calendar.getInstance().getTime());
dateLabel.setText(date);

try { Thread.sleep(1000);
} 
catch (InterruptedException e) {
// TODO Auto-generated catch block 
e.printStackTrace();
}
}
}
}