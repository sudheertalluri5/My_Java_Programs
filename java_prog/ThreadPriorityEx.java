class ThreadPriorityEx extends Thread{
	public static void main(String ar[]){
		System.out.println(Thread.currentThread().getPriority());
		ThreadPriorityEx t1=new ThreadPriorityEx();
		System.out.println(t1.getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		t1=new ThreadPriorityEx();
		System.out.println(t1.getPriority());
		try{
			t1.setPriority(15);
		}
		catch(IllegalArgumentException iae){
			System.out.println(iae);
		}
	}
}