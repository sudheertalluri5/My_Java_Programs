class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
class YieldEx{
	public static void main(String ar[]){
		MyThread mt=new MyThread();
		mt.start();
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}
}