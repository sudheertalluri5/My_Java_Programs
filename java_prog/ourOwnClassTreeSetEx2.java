import java.util.*;
class Employee implements Comparable{
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
	public String toString(){// if this is not there output will print object hashcodes by which we can't compare the output with our require output.
		return (this.eno+this.name);	
	}
	public int compareTo(Object o){
		//here eno is considered as unique so if eno added is already inserted then it is considered as duplicate and returns zero.
		int eno1=this.eno;
		int eno2=((Employee)o).eno;
		if(eno1>eno2)
			return 1;
		else if(eno1<eno2)
			return -1;
		else
			return 0;
	}	
}
class ourOwnClassTreeSetEx2 {
	public static void main(String ar[]){
		Employee e1=new Employee(100,"nag");
		Employee e2=new Employee(200,"balaih");
		Employee e3=new Employee(50,"chiru");
		Employee e4=new Employee(150,"venki");
		Employee e5=new Employee(100,"nag");
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}	
		 
		
