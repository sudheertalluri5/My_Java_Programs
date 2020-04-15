import java.util.*;
class StringTreeSetEx implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);//reverse alphabetical order
	}
	public static void main(String ar[]){
		TreeSet t=new TreeSet(new StringTreeSetEx());
		String a[]={"sudheer","durga sir","ram sir","venu sir"};
		for(int i=0;i<a.length;i++){
			t.add(a[i]);
		}
		System.out.println(t);
	}
}
