class A{
	public void d1(B b){
		System.out.println("Thread 1 starts Execution");
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ie){}
		System.out.println("Thread 1 calling last method of B class");
		b.last();
	}
	public void last(){
		System.out.println("A class last method");
	}
}
class B{
	public void d2(A a){
		System.out.println("Thread 2 starts execution");
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ie){}
		System.out.println("Thread 2 calling last method of A class");
		a.last();
	}
	public void last(){
		System.out.println("B class last method");
	}
}
class DeadLock1 extends Thread{
	A a=new A();
	B b=new B();
	public void m1(){
		this.start();
		b.d2(a);//executed by main thread
	}
	public void run(){
		a.d1(b);//executed by child thread
	}
}
class DeadLockEx1{
	public static void main(String ar[]){
		DeadLock1 d=new DeadLock1();
		d.m1();
	}
}