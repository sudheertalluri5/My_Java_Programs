class ParentThread extends Thread{
	static ThreadLocal tl=new ThreadLocal();
	public void run(){
		tl.set("Parent");
		ChildThread ct=new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run(){
		System.out.println(ParentThread.tl.get());
	}
}
class ThreadLocalEx3{
	public static void main(String ar[]){
		ParentThread pt=new ParentThread();
		pt.start();//null is printed as parent thread local value is not passed to child when we use ThreadLocal class we need to go for InheritedThreadLocal to do that.
	}
}