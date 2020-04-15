class ParentThread extends Thread{
	static InheritableThreadLocal tl=new InheritableThreadLocal();
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
class ThreadLocalEx4{
	public static void main(String ar[]){
		ParentThread pt=new ParentThread();
		pt.start();//Parent thread's local value is by default sent to child, to assign seperate value to child we need to override childValue method.
	}
}