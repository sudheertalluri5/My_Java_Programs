import java.util.TreeSet;
class NavigableSetEx{
	public static void main(String ar[]){
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(5000);
		t.add(4000);
		t.add(3000);
		System.out.println(t);
		System.out.println(t.ceiling(2000));
		System.out.println(t.higher(2000));
		System.out.println(t.floor(3000));
		System.out.println(t.lower(3000));
		System.out.println(t.pollFirst());
		System.out.println(t.descendingSet());
		System.out.println(t.pollLast());
		System.out.println(t);
	}
}