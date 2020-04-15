import java.util.concurrent.locks.ReentrantLock;
import java.util.Collection;
class MyThread extends Thread{
	static ReentrantLock l=new ReentrantLock();
	MyThread(String name){
		super(name);
	}
	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread()+" got lock");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
			l.unlock();
		}
		else{
			System.out.println(Thread.currentThread().getName()+" didn't get lock");
		}

	}
}
class ReentrantLockEx3{
	public static void main(String ar[]){
		MyThread t1=new MyThread("First");
		MyThread t2=new MyThread("Second");
		t1.start();
		t2.start();
	}
}