class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException ie){}
		}
	}
}
class StopEx1{
	public static void main(String ar[]){
		MyThread m=new MyThread();
		m.start();
		System.out.println("End of main thread");
		m.stop();
	}
}