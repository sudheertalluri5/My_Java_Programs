class ThreadB extends Thread{
	int total;
	Thread t;
	ThreadB(Thread t){
		this.t=t;
	}
	public void run(){
		try{
			t.join(100);//we have used same time but got the systematic output
		}
		catch(InterruptedException ie){}
		synchronized(this){
			System.out.println("Child Thread Starts calculation");
			for(int i=1;i<=100;i++)
				total+=i;
			this.notify();
			System.out.println("Child Thread notifies");
		}
	}
}
class InterThreadCommnEx4{
	public static void main(String ar[]) throws InterruptedException{
		Thread t=Thread.currentThread();
		ThreadB b=new ThreadB(t);
		b.start();
		Thread.sleep(100);//this makes the main thread to wait for infinite time
		synchronized(b){
			System.out.println("Main Thread Going to waiting state");
			b.wait();
			System.out.println("Main Thread Got Notification");
			System.out.println(b.total);
		}
	}
}