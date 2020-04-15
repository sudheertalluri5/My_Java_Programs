import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.IOException;

class CandidateCode{
	public static void main(String ar[]) throws IOException{
		int t,R,C,j,sub;
		boolean flag,res;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		t=Integer.parseInt(br.readLine());
		res=false;
		while(t-->0){
			st=new StringTokenizer(br.readLine());
			R=Integer.parseInt(st.nextToken());
			C=Integer.parseInt(st.nextToken());
			int r[]=new int[R];
			int c[]=new int[C];
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<R;i++){
				r[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(r);
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<C;i++){
				c[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(c);
			j=C-1;
			for(int i=0;i<R&&j>=0;i++,j--){
				flag=false;
				while(r[i]==0){
					if(i<R-1)
						i++;
					else
						break;
				}
				sub=r[i]*(R-i);
				if(c[j]==sub){
					res=true;
					for(int k=i;k<R;k++){
						r[k]-=r[i];
					}
				}
				else{
					res=false;
					break;
				}
				for(int k=0;k<R;k++)
					System.out.print(r[k]+" ");
				System.out.println();
				for(int k=0;k<C;k++)
					System.out.print(c[k]+" ");
				System.out.println();
			}
			if(res)
				System.out.println("YES");
			else	
				System.out.println("NO");
		}
	}
}