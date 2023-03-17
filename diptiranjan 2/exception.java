public class exception {
    public static void main(String[] args) {
      try{
        for(int i=10; i>=0;i--){
            System.out.println(9/i);
        }
       }
      catch (ArithmeticException e){
        System.out.println(e);
         }
       }
    }
