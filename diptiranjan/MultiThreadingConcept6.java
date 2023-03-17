public class MultiThreadingConcept7 implements Runnable{
private int threadNumber;
public MultiThreadingConcept7(int threadNumber){
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
MultiThreadingConcept7 mtc=new MultiThreadingConcept7(j);
Thread mythraed=new Thread(mtc);
mythread.start();
}
}
