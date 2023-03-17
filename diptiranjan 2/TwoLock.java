class NumVal{
	private int num[] = null;
	boolean valueSet = false;
	int i=0;
	NumVal(){
		num = new int[10];
	}
	public void setVal(int n){
		if(i<9){
			System.out.println("Putting value "+ n +" in the NumVal array");
			num[i] = n;
			i++;
		}
	}
	public int getVal(){
		if(i>=0){
			System.out.println("Giving n = " +num[i]);
			i--;
			return num[i+1];
		}
		else{
			return -1;
		}
	}
}
class MyThread extends Thread{
	NumVal NumObjToSetVal = null;
	public MyThread(String threadName, NumVal numV){
		super(threadName);
		NumObjToSetVal = numV;
	}
	public void run(){
		synchronized (NumObjToSetVal){
			int n=0;
			while(n<5){
System.out.println("THREAD NAME : " + Thread.currentThread().getName());
				n++;
				NumObjToSetVal.setVal(n);
				try{ 
					Thread.sleep(100);	
System.out.println(Thread.currentThread().getName() + " is awake now");
				}
				catch(Exception e){
					System.out.println("Exception Caught");
				}
				if(n==2){
					Thread.currentThread().suspend();
				}
			}
		}
	}
}
public class TwoLock{
	public static void main(String args[]){
		NumVal v = new NumVal();
		MyThread thread1 = new MyThread("Thread1 ", v);
		MyThread thread2 = new MyThread("Thread2 ", v);
		thread1.start();
		thread2.start();
		for(int i=500; i<=501; i++){
			System.out.println("Main Thread " + i);
		}
	}
}
