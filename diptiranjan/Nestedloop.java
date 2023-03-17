class Nestedloop{
 public static void main(String args[]){
     for(int i=0;i<=5;i++){     // outer loop
        for(int j=1;j<i;j++)      //inner loop
         {
           System.out.print(j);
         }
     System.out.println();
     }
   }
 }
