/*Marker Interface
 * It is a interface which has no declaration.
 * It can be used to assign the permission to the class, hence interface can be used to check the permission
 * It is used to check if any class implements the permission or if the class is the instance of the P
 * then only u have the permission to perform the methods  */

public class MarkerInterface {

	public static void main(String [] args){
		Demo obj = new Demo();
		if(obj instanceof P){
			obj.show();
		}
		else
			System.out.println("No Permission");
	}
}

interface P{}

class Demo implements P{
	public void show(){
		System.out.println("Hey there...");
	}
}