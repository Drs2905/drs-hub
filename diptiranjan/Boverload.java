class overloading{
    Object method() 
     {
     System.out.println(" super ");
     return 0;
     }
    }
 class Boverload extends overloading{
     String method()
      {
      System.out.println(" sub class ");
      return null;
     }
   public static void main(String args[]){
       Boverload x = new Boverload();
       x.method();
       overloading y= new overloading();
       y.method();
      }
    }
