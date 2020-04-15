class AnInRunnableEx1{
	public static void main(String ar[]){
		Runnable r1=new Runnable(){
			public void run(){
				for(int i=0;i<10;i++)
					System.out.println(Thread.currentThread().getName());
			}
		};
		Runnable r2=new Runnable(){
			public void run(){
				for(int i=0;i<10;i++)
					System.out.println(Thread.currentThread().getName());//can't use this as this doesn't have any reference
			}
		};
		System.out.println(r1.getClass().getName());
		System.out.println(r2.getClass().getName());
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
	}
}