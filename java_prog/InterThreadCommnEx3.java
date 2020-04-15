class ThreadB extends Thread{
	int total;
	public void run(){
		synchronized(this){
			System.out.println("Child Thread Starts calculation");
			for(int i=1;i<=100;i++)
				total+=i;
			this.notify();
			System.out.println("Child Thread notifies");
		}
	}
}
class InterThreadCommnEx3{
	public static void main(String ar[]) throws InterruptedException{
		ThreadB b=new ThreadB();
		b.start();
		Thread.sleep(100);//this makes the main thread to wait for infinite time
		synchronized(b){
			System.out.println("Main Thread Going to waiting state");
			b.wait(100);//solution to the previous problem but you must compromise on time wastage or shortage and it is not  even the complete solution because inconsistent output is there. It is just getting the program out from infinite wait time.
			System.out.println("Main Thread Got Notification");
			System.out.println(b.total);
		}
	}
}