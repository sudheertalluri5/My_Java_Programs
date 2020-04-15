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
class InterThreadCommnEx1{
	public static void main(String ar[]) throws InterruptedException{
		ThreadB b=new ThreadB();
		b.start();
		synchronized(b){
			System.out.println("Main Thread Going to waiting state");
			b.wait();
			System.out.println("Main Thread Got Notification");
			System.out.println(b.total);
		}
	}
}