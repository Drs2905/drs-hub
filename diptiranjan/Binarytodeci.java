  class Binarytodeci{
  public static void main(String args[]){
   int num=1100, rem,sum=0,i=0;
    while(num!=0){
    rem = num%10;
    sum=sum+rem*(int)Math.pow(2,i);
    num/=10;
    i++;
    }
    System.out.println(sum);
     }
   }
