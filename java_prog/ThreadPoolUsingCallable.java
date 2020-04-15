import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
class MyCallable implements Callable{
	int num;
	MyCallable(int num){
		this.num=num;
	}
	public Object call() throws InterruptedException{
		System.out.println(Thread.currentThread().getName() +" is responsible to find the sum of first " +num+" numbers"); 
		return (num*(num+1)/2);
	}
}
class ThreadPoolUsingCallable{
	public static void main(String ar[]) throws Exception{
		Future f;
		MyCallable mc[]={new MyCallable(4),new MyCallable(34),new MyCallable(54),new MyCallable(24),new MyCallable(14)};
		ExecutorService es=Executors.newFixedThreadPool(2);
		for(MyCallable MC:mc){
			f=es.submit(MC);
			System.out.println(f.get());
		}
		es.shutdown();
	}
}