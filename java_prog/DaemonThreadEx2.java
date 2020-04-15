class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){	
			System.out.println("Child Thread");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}	
class DaemonThreadEx2{
	public static void main(String ar[]){
		MyThread t=new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("End of Main Thread");
	}
}