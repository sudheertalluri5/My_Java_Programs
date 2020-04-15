import java.util.TreeMap;
class NavigableMapEx{
	public static void main(String ar[]){
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(1000,"Thousand");
		t.put(2000,"Two Thousand");
		t.put(5000,"Five Thousand");
		t.put(4000,"Four Thousand");
		t.put(3000,"Three Thousand");
		System.out.println(t);
		System.out.println(t.ceilingKey(2000));
		System.out.println(t.higherKey(2000));
		System.out.println(t.floorKey(3000));
		System.out.println(t.lowerKey(3000));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.descendingMap());
		System.out.println(t.pollLastEntry());
		System.out.println(t);
	}
}