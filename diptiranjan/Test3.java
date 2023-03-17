class Test3{
  void method(){
    System.out.println(" ist method");
            }
   void method(int a){
     System.out.println(" 2nd method");
            }
   void method(int a,  int b){
     System.out.println(" 3rd method");
            }
    public static void main(String args[]){
      Test3 a = new Test3();
        a.method();
      }
    
   }
