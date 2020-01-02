package day40_statickeyword;

public class staticPractice {
static long num1;
	long num2;//INSTANCE VERIABLES bunu static classta cagirmakicin obje create etmemiz lazim
	//maine objectle cagribiliriz 
	//1-staticPractice object1=new staticPractice();

	//2-syso(object1.num2);
	
	
	public static void main(String[] args) {
		System.out.println( num1 );//0
        System.out.println( staticPractice.num1 ); 
        
      //System.out.println( num2 );//instance comp err verir
      //System.out.println( staticPractice.num2 );//comp er verir cunku class ismiyle cagirmyz
        
        
		
		staticPractice.method1();//icinde static var class ismiyle cagirdim void
//class ismiyle cagrilan her method static tir
	staticPractice object1=new staticPractice();
	object1.method2();
	
}
public static void method1() {//static sadece class ismiyle mainde cagirdim
	System.out.println("A");
}
public void method2() {//void object ve exist constrct create edip object ismiyle mainde cagirdim
	System.out.println("B");
	}	
}












