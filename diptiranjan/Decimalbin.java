class Decimalbin{
  public static void main(String args[]){
   int rem, num=111, sum=0, i=1;
    while(num!=0)
    {
    rem = num%2;
    sum= sum+rem*1;
    i=i*10;
    num = num/2;
    }
   System.out.println("binary number is: " + sum);
  }
 }
