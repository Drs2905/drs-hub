class Mythread extends Thread{
     public void run(){
          System.out.println("current thread name:"+ Thread.currntThread().getname() );
          System.out.println("run() method called");
          Class Threadstart{
               public static void main(String args[])
               {
                    MyThread t=new MyThread();
                    t.start();
               }
          }
     }
}