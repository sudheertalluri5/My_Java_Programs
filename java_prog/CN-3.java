 class solution {

	public static void main(String ar[]) throws InterruptedException
	{
         //Write code here
        int sum=0,temp;
        int arr[]={9,9,9};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        while(sum%10!=sum){
            temp=sum;
            sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            System.out.println(sum);
            Thread.sleep(1000);
        }
        System.out.println(sum);
	}
}
