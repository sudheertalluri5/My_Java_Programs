class MyCollege{
	public void name(){
		System.out.println("Sardar Vallabhbhai Regional Engineering College");
	}
	public void address(){
		System.out.println("Ichchhanath, Athwa, Surat, GUJ, 395007");
	}
}
class MyUpdatedCollege extends MyCollege{
	public void name(){ //permenant change must be done with no change in remaining properties and even preserving the old name(below m0.name() preserves old name)
		System.out.println("Sardar Vallabhbhai National Institute of Technology");
	}
}
class AnInClassEx1{
	public static void main(String ar[]){
		MyCollege m0=new MyCollege();
		m0.name();
		m0.address();
		MyCollege m = new MyCollege(){
			public void address(){ //sometimes only address is just city so we go for this for that instant
				System.out.println("Surat");
			}
		};
		m.name();	
		m.address();
		MyUpdatedCollege m1=new MyUpdatedCollege(){
			public void name(){ //sometimes only shortcut is required then instead of creating a special fn for it we can use like this
				System.out.println("SVNIT");
			}
		};
		m1.name();
		m1.address();
		System.out.println(m0.getClass().getName());
		System.out.println(m.getClass().getName());
		System.out.println(m1.getClass().getName());
	}
}