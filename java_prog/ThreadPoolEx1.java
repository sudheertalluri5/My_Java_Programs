import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;		
class PrintJob implements Runnable{
	String name;
	PrintJob(String name){
		this.name=name;
	}
	public void run(){
		System.out.println(name+" Job Started by "+Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){}
		System.out.println(name+" Job completed by "+Thread.currentThread().getName());
	}
}
class ThreadPoolEx1{
	public static void main(String ar[]){
		ExecutorService service=Executors.newFixedThreadPool(2);
		PrintJob pj[]={new PrintJob("Durga sir"),new PrintJob("Ram sir"),new PrintJob("JavaTpoint"),new PrintJob("BeginnersBook")};
		for(PrintJob PJ:pj){
			service.submit(PJ);
		}
		service.shutdown();
	}
}