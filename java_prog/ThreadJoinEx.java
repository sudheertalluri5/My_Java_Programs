class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class ThreadJoinEx{
	public static void main(String ar[]) throws InterruptedException{
		MyThread mt=new MyThread();
		mt.start();
		//mt.join();
		mt.join(10000);
		for(long i=0;i<100000;i++)
			System.out.print(i);
	}
}