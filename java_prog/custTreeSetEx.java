import java.util.*;

class custTreeSetEx implements Comparator{
	public int compare(Object o1,Object o2){
// in this TreeSet if compare returns +ve then it traverses to right and if it returns -ve then it traverses to right of the present root 
		Integer I1=(Integer)o1;//object that is going to be inserted
		Integer I2=(Integer)o2;//object to which the o1 is to be compared
		return (I2-I1);//Descending order
		// or return I2.compareTo(I1);
	}
	public static void main(String ar[]){
		TreeSet t=new TreeSet(new custTreeSetEx());
		int a[]={14,1234,31,331,4553,1};
		for(int i=0;i<a.length;i++){
			t.add(a[i]);
		}
		System.out.println(t);
	}
}
