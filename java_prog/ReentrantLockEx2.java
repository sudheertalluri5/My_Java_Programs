import java.util.concurrent.locks.*;
class Display{
	public void wish(String name){
		ReentrantLock l=new ReentrantLock();//Here for every thread new instance of ReentrantLock is given and execution of both the threads will be parallel again
		l.lock();
		for(int i=0;i<10;i++){
			System.out.print("Thank you: ");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){}
			System.out.println(name);
		}
		l.unlock();
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}
class ReentrantLockEx2{
	public static void main(String ar[]){
		Display d=new Display();
		MyThread t1=new MyThread(d,"Durga sir");
		MyThread t2=new MyThread(d,"Ram sir");
		t1.start();
		t2.start();
	}
}