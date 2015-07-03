

public class MlevelIn{
	public static void main(String[] args){
		A obj = new B(5);
	
	} 

}

class A{
	public A(){
		System.out.println("In const A");
	}
	
	public A(int i){
		System.out.println("In const A para");
	}
}

class B extends A{
	public B(){
		System.out.println("In const B");
	}
	
	public B(int i){
		System.out.println("In const B para");
	}
}