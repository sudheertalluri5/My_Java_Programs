class ThreadGroupEx1{
	public static void main(String ar[]){
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup g=new ThreadGroup("First TG");
		System.out.println(g.getParent().getName());
		ThreadGroup g2=new ThreadGroup(g,"Second TG");
		System.out.println(g2.getParent().getName());
	}
}