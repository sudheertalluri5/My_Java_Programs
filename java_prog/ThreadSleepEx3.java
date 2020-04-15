class MyThread4 extends Thread{
	public void run(){
		try{
			System.out.println("Child Thread");
			Thread.sleep(0,100);
		}
		catch(InterruptedException ie){
			System.out.println("I got Interrupted");
		}
	}
}
class ThreadSleepEx3{
	public static void main(String ar[]){
		MyThread4 m=new MyThread4();
		m.start();
		for(long i=0;i<10000000;i++);
		m.interrupt();
		System.out.println("Completed");
	}
}
/*output is 
Child Thread
Completed 
since before the interrupt call is made child thread is dead and so Exception to be raised