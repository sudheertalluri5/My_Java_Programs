class MethodInnerClassEx4{
	public void m1(){
		int x=10;
		class Inner{
			public void m2(){
				System.out.println(x);
			}
		}
		Inner i=new Inner();
		i.m2();
	}
	public static void main(String ar[]){
		MethodInnerClassEx4 m=new MethodInnerClassEx4();
		m.m1();
	}
}