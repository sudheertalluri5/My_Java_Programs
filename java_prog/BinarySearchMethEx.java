import java.util.ArrayList;
import java.util.Collections;
class BinarySearchMethEx{
	public static void main(String ar[]){
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(4);
		Collections.sort(a);
		System.out.println(a);
		System.out.println(Collections.binarySearch(a,2));//1
		System.out.println(Collections.binarySearch(a,6));//-5
		System.out.println(Collections.binarySearch(a,8));//-5
		System.out.println(Collections.binarySearch(a,-1));//-1
		System.out.println(Collections.binarySearch(a,3));//-3
	}
}