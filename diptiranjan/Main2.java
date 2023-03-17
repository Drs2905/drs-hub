class Parent{
    void method(){
     System.out.println(" i m parent class");
     }
    }
class Subclass extends Parent{
     void method(){
     System.out.println(" i m child class");
     }
    }
class Main2{
    public static void main(String args[]){
    Parent a=  new Parent();
    Subclass b = new Subclass();
    a.method();
    b.method();
   }
  }
