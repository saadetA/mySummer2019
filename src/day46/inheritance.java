package day46;

class Data{
	public static int num1=10;
protected static int num2=20;
private static int num3=30;
static int num4=40;
}



public class inheritance extends Data {

public static void main(String[] args) {
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num4);//default ayni package de oldugu icin inherit
	//oldu baska package de olsa inherit olmazdi sadece  public ve protected inhert olur
	//System.out.println(num3);private inherit olmaz
//eger verbdaki static i cikarirsak instance olurlar onlari inherit ettigimiz
	//classin ismiyle obj create edip cagiririz
//inheritance obj=new inheritance();
//direk sinifi inherit ettigimiz ve ayni pack old icin kendi adiylada cagirirz
Data obj2=new Data();//ayni package

System.out.println(obj2.num1);
System.out.println(obj2.num2);
System.out.println(obj2.num4);

}



}
