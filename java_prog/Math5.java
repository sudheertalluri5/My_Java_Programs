import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Math5{
	public static void main(String ar[]) throws IOException{
		int n;
		boolean flag;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n:");
		n=Integer.parseInt(br.readLine());
		long temp=n;
		while(true){
			flag=true;
			for(int i=1;i<=n;i++){
				if(temp%i!=0){
					flag=false;
					break;
				}
			}
			if(flag==true)
				break;
			else
				temp+=n;
		}
		System.out.println(temp);
	}
}