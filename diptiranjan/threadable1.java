class newthread implements Runnable{
    Thread t;
    newthread(){
        t= new Thread(this,"Demo thread");
        System.out.println("Child thread: " + t);
        t.start();
    }
    public void run(){
        try{
            for(int i= 5; i>0;i--){
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
public class threadable1 {
    public static void main(String[] args) {
        new newthread();
        try{
            for(int i = 5; i>0; i--){
                System.out.println("Main thread: " +i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main Thread interrupted.");
        }
        System.out.println("Main Thread exiting.");
    }
}