
public class FinalDemo {
	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new C();
		obj.check();
		obj1.show();
	}
}

class A{
	
	public void check(){
		final int i=5;    // If we put i++ it'll show an error so it can't be incremented as final keyword is used along with it.... 
		System.out.println(i);
	}
}

class B{
	public void show(){
		System.out.println("In B show");
	}
}

class C extends B{
	public void show(){
		System.out.println("In C show");
	}
}