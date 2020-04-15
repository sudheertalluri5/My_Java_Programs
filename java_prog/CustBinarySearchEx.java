import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class CustBinarySearchEx implements Comparator{
	public int compare(Object o1,Object o2){
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	public static void main(String ar[]){
		ArrayList al=new ArrayList();
		al.add(9);
		al.add(1);
		al.add(4);
		al.add(8);
		al.add(6);
		CustBinarySearchEx cbse=new CustBinarySearchEx();
		Collections.sort(al,cbse);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al,7,cbse));//no need to passing cbse only we can pass any other obj of this class but the
		//thing is that we need to pass Comparator object of this type we can pass cbse to one and another to another search call,
		//the result will be the same because internally we need how sorting is taking place but not which object is sent.
		System.out.println(Collections.binarySearch(al,10,cbse));
		System.out.println(Collections.binarySearch(al,0,cbse));
		System.out.println(Collections.binarySearch(al,4,cbse));
		System.out.println(Collections.binarySearch(al,9));
		System.out.println(Collections.binarySearch(al,0));
	}
}	