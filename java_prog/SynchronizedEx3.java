//using synchronized keyword to get the required output and ordered output
class Display{
	public synchronized void myPrint(String name){
		for(int i=0;i<10;i++){
			try{
			System.out.print("Thank you ");
			Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(name);
		}
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
		d.myPrint(name);
	}
}
class SynchronizedEx3{
	public static void main(String ar[]){
		Display d=new Display();
		MyThread m1=new MyThread(d,"Durga sir");
		MyThread m2=new MyThread(d,"JavaTpoint");
		MyThread m3=new MyThread(d,"Ram sir");
		MyThread m4=new MyThread(d,"Venu sir");
		m1.start();
		try{
			m1.join();
			m2.start();
			m2.join();
			m3.start();
			m3.join();
			m4.start();
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}