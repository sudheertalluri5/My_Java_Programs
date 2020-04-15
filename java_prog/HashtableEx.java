import java.util.*;
class HashtableEx{
	int i;
	HashtableEx(int i){
		this.i =i;
	}
	public int hashcode(){
		return 0;
	}
	public String toString(){
		return String.valueOf(i);
	}
	public static void main(String ar[]){
		HashtableEx h1=new HashtableEx(5);
		HashtableEx h2=new HashtableEx(2);
		HashtableEx h3=new HashtableEx(6);
		HashtableEx h4=new HashtableEx(15);
		HashtableEx h5=new HashtableEx(23);
		HashtableEx h6=new HashtableEx(16);
		Hashtable H= new Hashtable();
		H.put(h1,"A");
		H.put(h2,"B");
		H.put(h3,"C");
		H.put(h4,"D");
		H.put(h5,"E");
		H.put(h6,"F");
		System.out.println(H);
	}
}