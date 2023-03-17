public class MultiThreadingConcept5 extends Thread{
private int threadNumber;
public MultiThreadingConcept5(int threadNumber){
this.threadNumber=threadNumber;}
public void run(){
for (int i=0;i<5;i++){
System.out.println(i+"-> From threadnumber: "+threadNumber);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
}
}
}
public static void main(String args[]){
for (int j=0;j<5;j++){
MultiThreadingConcept5 mtc=new MultiThreadingConcept5(j);
mtc.start();}
throw new RuntimeException();
}
}
