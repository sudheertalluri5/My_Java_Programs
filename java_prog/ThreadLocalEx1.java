class ThreadLocalEx1{
	public static void main(String ar[]){
		ThreadLocal t1=new ThreadLocal(){	
			public Object initialValue(){
				return "Ram sir";
			}
		};
		System.out.println(t1.get());
		//System.out.println(t1.initialValue()); --> having protected access so we cant get the output
		t1.set("durga sir");
		System.out.println(t1.get());
		t1.remove();
		System.out.println(t1.get());
	}
}