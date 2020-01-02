package day45Inheritance;
class Data{
public String name;	//public
private String age;//private
String ID;//default
public void Hello() {//public methd
System.out.println("hello");	
}
private void Hola() {//private methd
	System.out.println("Hola");	
}
void Aloha() {//default methd
	System.out.println("Aloha");	
}
}






public class MultiClassPractice {

	public static void main(String[] args) {
	Data obj=new Data();
System.out.println(obj.name);//public is visible everywhere
//System.out.println(obj.age);//private is not visible outside the class
System.out.println(obj.ID);	//default acces modfr is visible
	obj.Hello();//public methd
	obj.Aloha();//default in same package i can call
	//obj.Hola();// i cant call outside the class
	
	}
//protected visible in same package but can be inherit outside the package
//


}
