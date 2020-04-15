import java.util.PriorityQueue;
import java.util.Comparator;
class PriorityQueueEx2 implements Comparator{
	public int compare(Object o1,Object o2){
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	public static void main(String ar[]){
		PriorityQueue p=new PriorityQueue(11,new PriorityQueueEx2());
		for (int i=0;i<11;i++)
			p.offer(i);
		System.out.println(p);
	}
}