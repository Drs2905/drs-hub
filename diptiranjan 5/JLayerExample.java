import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class  JLayerExample{
    public static void main(String[] args) {

JLabel label1= new JLabel(); 
label1.setOpaque (true);
label1.setBackground (Color.RED); 
label1.setBounds (50, 50, 200, 200);

JLabel label2= new JLabel();
label2.setOpaque (true); 
label2.setBackground (Color. GREEN);
label2.setBounds (100, 100, 200, 200);

JLabel label3= new JLabel();
label3.setOpaque (true);
label3.setBackground (Color.BLUE);
label3.setBounds (150, 150, 200, 200);

JLabel label4 = new JLabel(" I AM LAST LAYER "); 
label4.setOpaque (true);
label4.setBackground (Color. YELLOW); 
label4.setBounds (200, 200, 200, 200);
JLayeredPane layeredPane = new JLayeredPane();
layeredPane.setBounds(0,0, 600, 600);

//layeredPane.add(label1, JLayered Pane. DEFAULT LAYER);
layeredPane.add(label1, Integer.valueOf(3));
layeredPane.add(label2,Integer.valueOf(2));
layeredPane.add(label3, Integer.valueOf(1)); 
layeredPane.add(label4, Integer.valueOf(0));

JFrame frame = new JFrame("JLayeredPane");
frame.add(layeredPane); frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
frame.setSize(new Dimension (500, 500));
frame.setLayout(null); 
frame.setVisible(true);
    }
}