import java.util.*;
class ToKnowClassDetailsOfCursors{
	public static void main(String ar[]){
		ArrayList al=new ArrayList();
		Iterator i=al.iterator();
		System.out.println(i.getClass().getName());//java.util.ArrayList$Itr
		Vector v=new Vector();
		i=v.iterator();
		System.out.println(i.getClass().getName());//java.util.Vector$Itr
	}
}