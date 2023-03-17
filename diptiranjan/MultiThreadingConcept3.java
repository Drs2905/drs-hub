public class MultiThreadingConcept3 extends Thread{
public void run(){
for (int i=0;i<5;i++){
System.out.println(i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
}
}
}
public static void main(String args[]){
for (int j=0;j<5;j++){
MultiThreadingConcept3 mtc=new MultiThreadingConcept3();
mtc.start();
}
}
}