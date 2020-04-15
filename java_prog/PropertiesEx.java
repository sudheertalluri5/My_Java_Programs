import java.util.*;
import java.io.*;

class PropertiesEx{
	public static void main(String ar[]) throws Exception{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);//loads in reverse order
		System.out.println(p.getProperty("1"));
		System.out.println(p.setProperty("6","no one"));
		System.out.println(p.setProperty("5","thop sudheer"));
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"first Commit");
	}
}

//In jdbc examples if we use this then that is the best of coding technique because to satisfy the reason we gave in class notes.