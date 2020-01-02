package day48Overriding;


class student{
	public  void printName() {
		System.out.println("saadet");
	}
}

	public class methodoverriding extends student{
                //  sub           //super



	public static void main(String[] args) {
		//any ,ethod can be overloading
	
		methodoverriding obj=new methodoverriding ();
	obj.printName();
	}	
	
	
	
	
	public void print(String str) {//ovrloading
	
}	
	
	
public void print(double a) {//overloading
	
}	
		
//public void print(String str) {//ilk create edince error verir
	
//}bu yuzden overload ayni classta olur ama overriding olmaz same 
//name same parameter
//eger classlar arasinda relationship(sub super inheritance)overriding yapabilriz
		
	
	
}
