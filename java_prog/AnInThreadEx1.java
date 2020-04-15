class AnInThreadEx1{
	public static void main(String ar[]){
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<10;i++)
					System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t2=new Thread(){
			public void run(){
				for(int i=0;i<10;i++)
					System.out.println(this.getName());
			}
		};
		t1.start();
		t2.start();
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
	}
}