class A{
       int a=10;
       }

class B2 extends A{
        int a= 20;
        void show(int a){
        System.out.println(this.a);
       }
    public static void main(String args[]){
        B2 x= new B2();
        x.show(90);
      }
  }
