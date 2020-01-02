package volkanistekmethod;

public class increment {
public static void main(String[] args) {
	int a=10;int b=20;//declare and initilaze veriables
	System.out.println("swap methodunu cagirmadan onceki "+a +"ve"+b);
	System.out.println(a+""+b);
	//invoke the swap methods
	swap( 10,20);
	System.out.println("swap methodunu cagirdiktan sonra "+a +"ve"+b);
	
	int x=5;
System.out.println("x in arttirilmadan onceki degeri "+x);
arttir(x);
System.out.println(" x in arttir metoduna girdikten sonraki degeri:"+x);
}
public static void arttir(int n) {
	n++;
System.out.println("Arttir metodunun icindeki n degeri: "+n);
// x methoda girince n ile eslesir ama xin degeri sadece metod icinde degisir
//maine geldiginde ayni degerde kalir 
}

public static void swap(int a ,int b) {
	int temp=0;
 
	
	temp=a;//a bos
	a=b;//a=20 b bos
	b=temp;
	
//b=a;
System.out.println("swap methodunun icerisinde"+a+""+b);
}





}
