
class Testk{
  public Testk(){
    System.out.print(" 1 "); 
     new Testk(10);
      System.out.print(" 5 "); 

            }
   public Testk(int temp){
     System.out.print(" 2");
      new Testk(10,20);
       System.out.print(" 4 ");

            }
   public Testk(int data,  int temp){
     System.out.print(" 3 ");
            }
    public static void main(String args[]){
      Testk a = new Testk();
     }
}
