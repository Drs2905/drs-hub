

class A{
       int a=10;
       }

class B3 extends A{
        int a= 20;
        void show(int a){
        System.out.println(a);
       }
    public static void main(String args[]){
        B3 x= new B3();
        x.show(90);
      }
  }
