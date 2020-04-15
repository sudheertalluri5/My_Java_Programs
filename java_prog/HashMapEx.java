import java.util.*;
class HashMapEx{
	public static void main(String ar[]){
		HashMap h=new HashMap();
		System.out.println(h.isEmpty());
		System.out.println(h.put(101,"Durga sir"));
		h.put(102,"javaTpoint");
		h.put(103,"Ram sir");
		h.put(104,"sudheer");
		h.put(105,"Venu sir");
		h.putIfAbsent(106,"BeginnersBook");//if key is not there then we will insert key-value pair else ignore
		System.out.println(h);		
		h.putIfAbsent(101,"ThopDurgaSir");//ignored case of previous comment
		System.out.println(h);    	
		System.out.println(h.put(101,"ThopDurgaSir"));//returns old value and inserts new value into Entry
		System.out.println(h);
		System.out.println(h.containsKey(104));
		System.out.println(h.containsValue("sudheer"));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		Set s=h.keySet();
		System.out.println(s);
		Collection c=h.values();
		System.out.println(c);
		s=h.entrySet();
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			if(e.getValue().equals("ThopDurgaSir")){
				e.setValue("Thop Durga Sir");		
			}
			if(e.getValue().equals("sudheer")){
				h.replace(e.getKey(),e.getValue(),"Future Thop");//new value is placed for given key-value pair		
			}
			if(e.getValue().equals("BeginnersBook")){
				h.remove(e.getKey(),e.getValue());		
			}
			if(e.getValue().equals("Venu sir")){
				h.replace(105,"Now a days thop");//replaces value for given key		
			}
		}
		System.out.println(h);
		h.clear();
		System.out.println(h.isEmpty());
		System.out.println(h.size());
	}
}
		
