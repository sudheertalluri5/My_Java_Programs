class MyThread3 extends Thread{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("Catch me if you can");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie){
			System.out.println("Interrupted");
		}
	}
}
class ThreadSleepEx1{
	public static void main(String ar[]){
		MyThread3 m=new MyThread3();
		m.start();
		m.interrupt();
		System.out.println("completed");
	}
}
