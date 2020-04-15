import java.util.*;
class Employee {
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno=eno;
		this.name=name;
	}	
	public String toString(){
		return (this.name+this.eno);
	}
}
class ourOwnClassTreeSetEx implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
	public static void main(String ar[]){
		Employee e1=new Employee(100,"nag");
		Employee e2=new Employee(200,"balaih");
		Employee e3=new Employee(50,"chiru");
		Employee e4=new Employee(150,"venki");
		Employee e5=new Employee(100,"nag");
		TreeSet t=new TreeSet(new ourOwnClassTreeSetEx());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}	
		 
		
