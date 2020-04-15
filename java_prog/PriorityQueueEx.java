import java.util.PriorityQueue;
import java.util.NoSuchElementException;
class PriorityQueueEx{
	public static void main(String ar[]){
		PriorityQueue p=new PriorityQueue();
		System.out.println(p.peek());
		System.out.println(p.poll());
		try{
			System.out.println(p.element());
		}
		catch(NoSuchElementException nsee){
			System.out.println("element() raising exception");
		}
		try{
			System.out.println(p.remove());
		}
		catch(NoSuchElementException nsee){
			System.out.println("remove() raising exception");
		}
		for(int i=0;i<10;i++)
			p.offer(i);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);//Windows platform clearly not providing support for PriorityQueue
	}
}