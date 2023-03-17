import javax.swing.*;
public class ButtonExample2{ 
ButtonExample2(){
    JFrame f = new JFrame("Button Example");
    JButton b=new JButton(new ImageIcon("C:/Users/LENOVO/Desktop/car image.jpeg"));
    b.setBounds(200, 200, 400, 300); 
        f.add(b);

f.setSize(400, 500); 
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
public static void main(String[] args) { 
    new ButtonExample2();
}
}