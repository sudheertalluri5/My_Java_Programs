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
class DaemonThreadEx1{
	public static void main(String ar[]){
		MyThread t=new MyThread();
		t.start();
		System.out.println("End of Main Thread");
		//don't forget to refer DaemonThreadEx2.java where the actual magic lies
	}
}