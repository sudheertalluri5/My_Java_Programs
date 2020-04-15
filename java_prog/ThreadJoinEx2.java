class MyThread2 extends Thread{
	static Thread mt;
	public void run(){
		try{
			mt.join();
		}
		catch(Exception e){}
		for(int i=0;i<10;i++)
			System.out.println("Child Thread");
	}
}
class ThreadJoinEx2{
	public static void main(String ar[]) throws InterruptedException{
		MyThread2.mt=Thread.currentThread();
		MyThread2 t1=new MyThread2();
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}