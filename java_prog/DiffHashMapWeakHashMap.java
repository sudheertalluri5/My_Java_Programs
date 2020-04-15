import java.util.*;
class DiffHashMapWeakHashMap{
	public static void main(String ar[]) throws Exception{
		HashMap m=new HashMap();
		WeakHashMap m1=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"it won't disappear");
		System.out.println(m);
		t=null;
		System.out.println(m);
		System.gc();
		Thread.sleep(1000);
		t=new Temp();
		System.out.println(m);
		m1.put(t,"it will disappear");
		System.out.println(m1);
		t=null;
		System.out.println(m1);
		System.gc();
		Thread.sleep(1000);
		System.out.println(m1);
		t=new Temp();
		m.put("will it",t);
		t=null;
		System.out.println(m);
		System.gc();
		Thread.sleep(1000);
		System.out.println(m);
		t=new Temp();
		m1.put("will it",t);
		t=null;
		System.out.println(m1);
		System.gc();
		Thread.sleep(1000);
		System.out.println(m1);
	}
}

class Temp{
	public void finalize(){//overriding
		System.out.println("GC killed Temp");
	}
}

