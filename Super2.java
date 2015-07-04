
public class Super2 {

	public static void main(String [] args){
		
		F obj = new F(5);
		//F obj1 = new F();
	}
}

class E{
	
	public E(){
		
		System.out.println("In const E");
	}
	
	public E(int i){
		
		System.out.println("In const E para");
	}
}

class F extends E{
	
public F(){
		System.out.println("In const F");
	}
	
	public F(int i){
		super(i);
		System.out.println("In const F para");
	}
}