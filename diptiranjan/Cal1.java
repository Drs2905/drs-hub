import java.util.Scanner;
 class calculator1 {
     float a,b,c,sub,mlt,div;
     void add(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter two number");
         a=  sc.nextFloat();
         b= sc.nextFloat();
         c= a+b;
         System.out.println("addition " + c);
     }
}
class substraction extends calculator1{
     void sub(){
         sub= a-b;
         System.out.println("substraction "  + sub);
     }
}
class multiply1 extends substraction{
      void mlt(){
          mlt= a*b;
          System.out.println("multiply "+ mlt);
      }

}
class divison1 extends multiply1{
     void div(){
         div= a/b;
         System.out.println(" divison " + div);
     }
}
public class Cal1{
    public static void main(String[] args) {
        divison1 x= new divison1();
        x.add();
        x.sub();
        x.mlt();
        x.div();
    }
  }
