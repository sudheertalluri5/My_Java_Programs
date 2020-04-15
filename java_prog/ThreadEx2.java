class MyThread implements Runnable{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("Thread-2");
	}
}
class ThreadEx2{
	public static void main(String ar[]){
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Thread-1");
	}
}