class ChildThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
class ThreadPriorityEx2{
	public static void main(String ar[]){
		ChildThread ct=new ChildThread();
		ct.setPriority(10);
		ct.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}
}