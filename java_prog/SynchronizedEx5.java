class Display{
	public synchronized void displayint(){
		for(int i=0;i<10;i++){
			System.out.print(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		System.out.println();
	}
	public synchronized void displaychar(){
		for(int i=0;i<10;i++){
			System.out.print((char)(i+'A'));
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
	}
}
class MyThread6 extends Thread{
	Display d;
	MyThread6(Display d){
		this.d=d;
	}
	public void run(){
		d.displayint();
	}
}
class MyThread7 extends Thread{
	Display d;
	MyThread7(Display d){
		this.d=d;
	}
	public void run(){
		d.displaychar();
	}
}
class SynchronizedEx5{
	public static void main(String ar[]){
		Display d=new Display();
		MyThread6 m1=new MyThread6(d);
		MyThread7 m2=new MyThread7(d);
		m1.start();
		m2.start();
	}
}