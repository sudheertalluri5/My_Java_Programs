class Display{
	public void wish(String name){
		for(long i=0;i<Long.MAX_VALUE;i++);//huge delay
		;;;;;;;//suppose as one lakh lines of code
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.print("Thank You very much ");
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie){
					System.out.println(ie.getMessage());
				}
			System.out.println(name);
			}
		}
		;;;;;//suppose some more lakhs of code
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}
class SynchronizedBlockEx1{
	public static void main(String ar[]){
		Display d=new Display();
		MyThread t1=new MyThread(d,"Durga sir");
		MyThread t2=new MyThread(d,"JavaTpoint");
		t1.start();
		t2.start();
	}
}