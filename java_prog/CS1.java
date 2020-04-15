/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/


        import java.io.*;
import java.util.*;
public class CS1 {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        int t1,n,max,temp,j,temp2,k,l,a,first,second;
        boolean flag;
        String res="",r="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        t1=Integer.parseInt(br.readLine());
        while(t1-->0){
            temp2=0;temp=0;
            n=Integer.parseInt(br.readLine());
            int token[]=new int[n];
            Stack<Integer> s=new Stack<Integer>();
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                token[i]=Integer.parseInt(st.nextToken());
            }
            first=token[0];second=0;
            for(int i=1;i<n;i++){
                if(first>second){
                    temp=first;
			if(token[i]>0)		   
	System.out.print(token[i]);
                }
                else{
                    temp=second;   
                }
                first=second+token[i];
                second=temp;
	    }
		if(first>second){
			System.out.println(first);
		}
		else{
			System.out.println(second);
		}
		//System.out.println(res+"    "+r);
        }
   }
}

