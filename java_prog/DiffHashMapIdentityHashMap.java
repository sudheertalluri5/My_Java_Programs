import java.util.*;
class DiffHashMapIdentityHashMap{
	public static void main(String ar[]){
		HashMap m=new HashMap();//uses equals() method to check duplicate keys
		IdentityHashMap m1=new IdentityHashMap();//uses "==" operator to check duplicate keys
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		m.put(I1,"Val-1");
		m.put(I2,"Val-2");
		m1.put(I1,"Val-1");
		m1.put(I2,"Val-2");
		System.out.println(m);
		System.out.println(m1);
	}
}		
