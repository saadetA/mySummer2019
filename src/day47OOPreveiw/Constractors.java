package day47OOPreveiw;

class safa{
public safa(int a) {
	System.out.println("merhaba safa");
}	
}

class celil extends safa{
	
	public celil() {
		super(5);
	System.out.println("burasi sub class");
	}

}

class ibrahim{
	public ibrahim() {
		System.out.println("default constrctr");
	}
}

public class Constractors {
public static void main(String[] args) {
	safa isim1=new safa(5);
celil isim2=new celil();
ibrahim isim3=new ibrahim();
}






}
