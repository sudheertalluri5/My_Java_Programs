class MyThread extends Thread{
	MyThread(ThreadGroup g,String name){
		super(g,name);
	}
	public void run(){
		System.out.println(this.getName());
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){}
	}
}
class ThreadGroupMeth{
	public static void main(String ar[]) throws InterruptedException{
		ThreadGroup g=new ThreadGroup("PARENT");
		System.out.println("Parent: "+ g.getName());
		System.out.println("Active Count of Threads in parent: "+ g.activeCount());
		System.out.println("Active count of sub Thread Groups in parent: " +g.activeGroupCount());
		ThreadGroup g2=new ThreadGroup(g,"CHILD");
		System.out.println("Child: " +g2.getName());
		System.out.println("Active Count of Threads in parent: "+ g.activeCount());
		System.out.println("Active count of sub Thread Groups in parent: " +g.activeGroupCount());
		MyThread t1=new MyThread(g,"First");
		MyThread t2=new MyThread(g2,"Second");
		t1.start();
		t2.start();
		Thread.sleep(1);
		System.out.println("Active Count of Threads in parent: "+ g.activeCount());
		System.out.println("Active count of sub Thread Groups in parent: " +g.activeGroupCount());
		g.list();
		Thread.sleep(10000);
		g.list();
		System.out.println("Active Count of Threads in parent: "+ g.activeCount());
		System.out.println("Active count of sub Thread Groups in parent: " +g.activeGroupCount());
		System.out.println("parent-child: "+g2.getParent().getName()+" "+g2.getName());
	}
}