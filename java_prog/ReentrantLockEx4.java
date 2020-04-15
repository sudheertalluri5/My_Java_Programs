import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
class MyThread extends Thread{
	static ReentrantLock l=new ReentrantLock();
	MyThread(String name){
		super(name);
	}
	public void run(){
		do{
			try{
				if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
					System.out.println(Thread.currentThread().getName()+" got lock");
					try{
						Thread.sleep(30000);
					}
					catch(InterruptedException ie){
						System.out.println("Sleeping Threading Getting Interrupted");
					}
					System.out.println(Thread.currentThread().getName()+" releases lock");
					l.unlock();
					break;	
				}
				else{
					System.out.println(Thread.currentThread().getName()+" unable to get lock");
				}
			}
			catch(InterruptedException ie){
				System.out.println("Due to TryLock getting interrupted");
			}
		}
		while(true);
	}
}
class ReentrantLockEx4{
	public static void main(String ar[]){
		MyThread t1=new MyThread("FIRST");
		MyThread t2=new MyThread("SECOND");
		t1.start();
		t2.start();
	}
}