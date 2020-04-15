class MethodInnerClassEx3{
	int x=10;
	static int y=20;
	public void m1(){
		class Inner{
			public static void m2(){
				System.out.println(x);//Compile Time Error non static variable x cannot be referenced from a static context
				System.out.println(y);
			}
		}
		Inner i=new Inner();
		i.m2();
	}
	public static void main(String ar[]){
		new MethodInnerClassEx3().m1();
	}
}