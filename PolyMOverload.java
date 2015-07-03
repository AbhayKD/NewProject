
public class PolyMOverload {
	public static void main(String[] args) {
		C obj = new C();
		obj.show(5.5);
	}
}
 class C{
	 
	 public void show(){
		 
		 System.out.println("Show without para");
	 }
	 
	 public void show(int i){
		 
		 System.out.println("Show with the para int..");
	 }
	public void show(double i){
	
		System.out,println("Show with para double..");
	}
 }