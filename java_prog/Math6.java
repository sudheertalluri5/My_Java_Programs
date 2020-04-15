import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Math6{
	public static void main(String ar[]) throws IOException{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		System.out.println((long)(Math.pow(n*(n+1)/2,2)-((n*(n+1)*(2*n+1))/6)));
	}
}