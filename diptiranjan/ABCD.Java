class ABCD{
  void method(int...a){
   System.out.println("int ");
   }
  
   void method(int a ){
    System.out.println(" 2nd int ");
     }
     
     public static void main(String args[]){
     ABCD a= new ABCD();
          a.method(5,6,7,8,9,10,11);
          a.method(4);
      }
   }
