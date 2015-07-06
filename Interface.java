/*Interface
 * It can be used to create a multiple inheritance
 * It can also be used to have the security of the methods
 * It is different from class in just one aspect that is in class methods a declared and same goes for the 
 * interfaces but as in class methods are defined in interfaces it is not like that.*/
public class Interface {
	public static void main(String[] args) {
		C obj1 = new C();	//Here we are creating object and reference both of C hence we can call the display() method using the object of this.
		obj1.display();
		A obj = new C();	//Here we are creating a reference to A and creating and object or in simpler words allocating memory to C
		obj.show();			//SO hence when we are calling show() it'll call the show of A.
	}
}

interface A{
	public void show();
}

interface B{
	public void show();
}

class C implements A,B{
	public void show(){
		System.out.println("Implementation of Interfaces");
	}
	
	public void display(){
		System.out.println("A new method in Class C");
	}	
}