import javax.swing.*; 
public class TableExample {
    JFrame f; 
    TableExample(){
    f=new JFrame(); 
    String data[][]={{"301","dipti", "7650000"},{"401", "sthita", "800000"},{"501", "rahul", "700000"},{"601", "shyam","900000"},{"602", "subu", "90000"}};
    String column[]={"ID", "NAME","SALARY"}; 
    JTable jt=new JTable(data, column);
    jt.setBounds(30,40,480,400);
    JScrollPane sp=new JScrollPane(jt);
    f.add(sp); 
    f.setSize(480,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) { 
        new TableExample();
    }
}