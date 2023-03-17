 class mytest{
      static 
        {
            initialize();
        }
       public static int sum;
       public static int getSum()
        {
             initialize();
              return sum;
       // System.out.println(" Getsum :  " +sum);
        }
        private static boolean initialized = false;
        private static void initialize()
        {
              if(!initialized){
               for(int i = 0; i<100;i++)
                sum+=i;
               System.out.println(" Init : " +sum);
                initialized = true;
         }
        }
       }
       public class Testsic{
          public static void main(String args[]){
           System.out.println(mytest.getSum());
          }
         }
