public class MultiThreadingConcept4 extends Thread{
private int threadNumber;
public MultiThreadingConcept4(int threadNumber){
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
MultiThreadingConcept4 mtc=new MultiThreadingConcept4(j);
mtc.start();
}
}
}