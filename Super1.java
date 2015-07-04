

public class Super1 {
	public static void main(String[] args){
		B obj = new B();
		obj.show();
		obj.abc();
	} 

}

class A{
		int i=5;
		public void abc(){
			System.out.println("A abc");
		}
}

class B extends A{
	int i=4;
	public void show(){
		System.out.println(super.i);
	}
	
	public void abc(){
		super.abc();
		System.out.println("B abc");
	}
	
}