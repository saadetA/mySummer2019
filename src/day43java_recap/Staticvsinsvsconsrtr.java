package day43java_recap;

public class Staticvsinsvsconsrtr {


	
	static {
System.out.println("static block");//1.ilk print tek kez
//only get exc ones first exc/////webDriver//precondition maximize screen icin kullaniriz
}
/////////////////

{
	System.out.println("instance block");//2- exc when obj created	
}
//after static block before constrctr how many obj create unstanse bloc exc that times
//kac obj cre edilirse okadar print olur


///////////////////////
public Staticvsinsvsconsrtr () {// 3- when the obj is created exc kac obje okadar constr exc
	System.out.println("constructor");
}
//
public static void main(String[] args) {
	Staticvsinsvsconsrtr obj=new Staticvsinsvsconsrtr();	
	Staticvsinsvsconsrtr obj2=new Staticvsinsvsconsrtr();	
System.out.println("main method");

}



}
