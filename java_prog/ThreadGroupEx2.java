class ThreadGroupEx2{
	public static void main(String ar[]){
		ThreadGroup g=new ThreadGroup("TG");
		Thread t1=new Thread(g,"First");
		Thread t2=new Thread(g,"Second");
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		g.setMaxPriority(3);
		Thread t3=new Thread(g,"Third");
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getPriority());
		g.setMaxPriority(6);
		Thread t4=new Thread(g,"fourth");
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getPriority());
		System.out.println(t4.getName()+" "+t4.getPriority());
	}
}