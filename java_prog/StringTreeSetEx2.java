import java.util.*;
class StringTreeSetEx2 implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=o1.toString();
		String s2=o2.toString();
		//increasing length order if length is equal then alpahetical order.
		if(s1.length()!=s2.length()){
			return (s1.length()-s2.length());
		}
		else
			return s1.compareTo(s2);
	}
	public static void main(String ar[]){
		TreeSet t=new TreeSet(new StringTreeSetEx2());
		String a[]={"kiran","sudheer","karthik","sravan"};
		for(int i=0;i<a.length;i++){
			t.add(a[i]);
		}
		System.out.println(t);
	}
}
