class MyThread4 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Catch me if you can");
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				System.out.println("Interrupted");
			}
		}
	}
}
class ThreadSleepEx2{
	public static void main(String ar[]){
		MyThread4 m=new MyThread4();
		m.start();
		m.interrupt();
		System.out.println("completed");
	}
}
