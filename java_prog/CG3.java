
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
class CandidateCode{
	public static void main(String ar[]) throws IOException{
		int t,n,temp,sum,max;
		boolean flag;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		t=Integer.parseInt(br.readLine());
		while(t-->0){
			n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			int b[]=new int[n];
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(a);
			for(int i=0;i<n;i++){
                b[i]=a[n-1-i];
            }
            for(int i=0;i<n;i++){
                a[i]=b[i];
				//System.out.print(a[i]);
            }
			max=0;
			for(int i=0;i<(1<<n);i++){
				sum=0;
				boolean digit[]=new boolean[10];
	previous:	for(int j=0;j<n;j++){
					temp=a[j];
					if((i&(1<<j))>0){
						//System.out.print(a[j]+" ");
						boolean digit2[]=new boolean[10];
						temp=a[j];
						while(temp>0){
							digit2[temp%10]=true;
							temp=temp/10;
							//System.out.print(temp);
						}
						flag=false;
						for(int k=0;k<10;k++){
							if(digit[k]&&digit2[k]){
								flag=true;
								break;
							}
						}
						if(!flag){
							for(int k=0;k<10;k++){
								if(!digit[k]){
									digit[k]=digit2[k];
								}
							}
							sum+=a[j];
						}
					}
				}
				//System.out.println();
				max=Math.max(sum,max);
				//System.out.println(max);
			}
			System.out.println(max);
		}
	}
}