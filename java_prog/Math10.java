class Math10{
	public static void main(String ar[]){
		long sum=0;
		boolean flag=false;
		for(int i=2;i<8;i++){
			flag=false;
			for(int j=2;j<=(Math.sqrt(i));j++){
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(flag==false)
				sum+=i;
		}
		System.out.println(sum);
	}
}