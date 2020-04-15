class Display{
	public synchronized void myPrint(String name){
		for(int i=0;i<10;i++){
			System.out.print("Thank You");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println(ie);
			}
			System.out.println(name);
		}
	}
}
class MyThread5 extends Thread{
	Display d;
	String name;
	MyThread5(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.myPrint(name);
	}
}
class SynchronizedEx4{
	public static void main(String ar[]){
		Display d1=new Display();
		Display d2=new Display();
		MyThread5 m1=new MyThread5(d1,"Durga sir");
		MyThread5 m2=new MyThread5(d2,"Ram sir");
		m1.start();
		m2.start();
	}
}