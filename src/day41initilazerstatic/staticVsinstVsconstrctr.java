package day41initilazerstatic;

public class staticVsinstVsconstrctr {

static {
System.out.println("static block");	//0bjeye bagli degil  1
}
//static block execution does not on the object
//executed as soon as the class is is loaeded only once
{
	System.out.println("instance block");//objeye  creatine bagli  2
	//instance block executoin depends on the object
}//when is object created ,instance block runs first,than constrc
//constrctr exected



public static void main(String[] args) {
	staticVsinstVsconstrctr obj=new staticVsinstVsconstrctr();	
	staticVsinstVsconstrctr obj2=new staticVsinstVsconstrctr();	
	staticVsinstVsconstrctr ob3=new staticVsinstVsconstrctr();	
    // constructor and instance block' execution depends on the creation of object
System.out.println("i am main");
}

public staticVsinstVsconstrctr() {
	System.out.println("constractor"); // 3
} //constractor executed depends on the object
// when object is created, constructor runs after the instance block





}
