import java.util.Scanner;
class Input{
 public static void main(String args[]){
  System.out.println(" enter the input ");
  Scanner sc = new Scanner(System.in);
  System.out.println(" enter the number ");
  int a = sc.nextInt();
  int count = 0;
  while(a!=1){
    if(a%2!=0){
     a=(a*3)+1;
    
      }
    else{
      a= a/2;
       count++;
        }
       }
       
      System.out.println(" number of steps:  " + count);
      
     }
    }