class ParentThread extends Thread{
	static InheritableThreadLocal tl=new InheritableThreadLocal(){
		public Object childValue(Object parentValue){
			return "Child";
		}
	};
	public void run(){
		tl.set("Parent");
		ChildThread ct=new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run(){
		System.out.println(ParentThread.tl.get());//Child
	}
}
class ThreadLocalEx5{
	public static void main(String ar[]){
		ParentThread pt=new ParentThread();
		pt.start();
	}
}