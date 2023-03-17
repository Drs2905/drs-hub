class TestMultiNaming1 extends Thread{
public void run(){
System.out.println("running...");
}
public static void main(String args[]){
TestMultiNaming1 t1=new TestMultiNaming1();
TestMultiNaming1 t2=new TestMultiNaming1();
TestMultiNaming1 t3=new TestMultiNaming1();
TestMultiNaming1 t4=new TestMultiNaming1();
TestMultiNaming1 t5=new TestMultiNaming1();
System.out.println("Name of t1:"+t1.getName());
System.out.println("Name of t2:"+t2.getName());
System.out.println("Name of t3:"+t3.getName());
System.out.println("Name of t4:"+t4.getName());
System.out.println("Name of t5:"+t5.getName());
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
t1.setName("Amity university");
t2.setName("Delhi university");
t3.setName("Punjab university");
t4.setName("Manipal university");
t5.setName("Mumbai university");
System.out.println("After changing name of t1:"+t1.getName());
System.out.println("After changing name of t2:"+t2.getName());
System.out.println("After changing name of t3:"+t3.getName());
System.out.println("After changing name of t4:"+t4.getName());
System.out.println("After changing name of t5:"+t5.getName());
}}

