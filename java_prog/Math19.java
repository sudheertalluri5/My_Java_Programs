import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Math19{
	public static void main(String ar[]){
		int i=1901;
		int count2=4,count=0,res=0;
		while(i<2001){
			if(i%4==0){
				if(i%400==0)
					count++;
				else
					count+=2;
			}
			else
				count++;
			if(count2-count<0){
				count=0;
				res+=count2;
				if(count2==3)
					count2=4;
				else
					count2=3;
			}
			i++;
		}
		System.out.println(res);				
	}
}