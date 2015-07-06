/*ANONYMUS OBJECT*/

public class AnonymusObj {
	public static void main(String[] args){
	new D(5);	//Anonymous object which is a object which can be used only once. So no name like 'obj' is required to be assigned to the object.. 
	} 

}

class D{
	
	public D(int i){
		
		System.out.println(++i);
		}
}