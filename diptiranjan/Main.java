
class c{
   void method(int a ,int b){
    System.out.println("a b");
   }
  }
 
class d extends c{
    void method( int c , int d){
     System.out.println("c d");
      }
     }
public class Main{
  public static void main(String args[]){
   d x = new d();
    x.method(5,6);
    }
   }
