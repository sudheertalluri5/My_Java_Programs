class CustomerThread extends Thread{
	static Integer custId=0;
	private static ThreadLocal tl=new ThreadLocal(){
		protected Integer initialValue(){
			return ++custId;
		}
	};
	CustomerThread(String name){
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" executing with customer id "+tl.get());
	}
}
class ThreadLocalEx2{
	public static void main(String ar[]) throws InterruptedException{
		CustomerThread c1=new CustomerThread("T-1");
		CustomerThread c2=new CustomerThread("T-2");
		CustomerThread c3=new CustomerThread("T-3");
		CustomerThread c4=new CustomerThread("T-4");
		c1.start();
		Thread.sleep(1000);
		c2.start();
		Thread.sleep(1000);
		c3.start();
		Thread.sleep(1000);
		c4.start();
	}
}