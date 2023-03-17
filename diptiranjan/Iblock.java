public class Iblock{
  public Iblock()
   {
    System.out.println(" no argument constructor");
   }
   public Iblock(int x)
   {
    System.out.println(" parameterized constructor");
   }
    
   {
    System.out.println(" hello world ");
   }
   public static void main(String args[]){
     Iblock a1, a2;
      a1= new Iblock();
      a2= new Iblock(5);
     }
   } 
