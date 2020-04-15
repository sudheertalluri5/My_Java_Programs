class MyThread2 extends Thread{
	public void run(){
		System.out.println("Thread ?");
			System.out.println(Thread.currentThread().getName());
	}
}
class ThreadEx3 {
	public static void main(String ar[]){
		MyThread2 m=new MyThread2();
		Thread t=new Thread(m);
		m.start();
		try{
			t.start();
		}
		catch(IllegalThreadStateException itse){
			System.out.println("Can't start a thread in runnable mode");
		}
		System.out.println("Thread main");
		System.out.println(Thread.currentThread().getName());
		//System.out.println(t.getName());
		//System.out.println(m.getName());
		Thread.currentThread().setName("Sudheer");
			System.out.println(10/0);
	}
}