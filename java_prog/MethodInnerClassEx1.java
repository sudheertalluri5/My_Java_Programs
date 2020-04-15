class MethodInnerClassEx1{
	public void m1(){
		class Inner{
			public void display(String s){
				System.out.println("Don't mess with "+s);
			}
		}
		Inner i=new Inner();
		i.display("Sudheer");
		;;;
		i.display("Dharmi");
		;;;
		i.display("Shiva");
		;;;
		i.display("Kiran");
		;;;
		i.display("Project - F");
	}
	public static void main(String ar[]){
		new MethodInnerClassEx1().m1();
	}
}
