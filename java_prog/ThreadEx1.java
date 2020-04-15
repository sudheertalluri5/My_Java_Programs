class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("Thread-2");
	}
}
class ThreadEx1{
	public static void main(String ar[]){
		MyThread mt=new MyThread();
		mt.start();
		for(int i=0;i<10;i++)
			System.out.println("Thread-1");
	}
}