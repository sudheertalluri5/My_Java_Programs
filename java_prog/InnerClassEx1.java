class A{
	class B{
		class C{
			public void m1(){
				System.out.println("Inside Inner class of Inner class of an Outer Class");
			}
		}
	}
}
class InnerClassEx1{
	public static void main(String ar[]){
		A a=new A();
		A.B b=a.new B();
		A.B.C c=b.new C();
		c.m1();
	}
}
