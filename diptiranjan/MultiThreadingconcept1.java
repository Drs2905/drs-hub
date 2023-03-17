class MultiThreadingConcept1 extends Thread{
    public void run(){
    for (int i=0;i<10;i++){
    System.out.println(i);
    try{
    Thread.sleep(1000);
    }
    catch(InterruptedException e){
    }
    }}
    public static void main(String args[]){
    MultiThreadingConcept1 mtc=new MultiThreadingConcept1();
    MultiThreadingConcept1 mtc1=new MultiThreadingConcept1();
    mtc.start();
    mtc1.start();
    }
    }
    