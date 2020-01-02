package day39_instanse_reveiev;

public class CellPhones {
//attrb
	String brand;
	double screensize;
	String color;
	long price;
	String model;

//object sayfasinda user attributsleri create etmezse onlarin 
	//dfault voluelarini gosterecek
//bir constractor olustururuz.bunu iphone1 de kullaniriz yeni phone icin yeni bir constractor olustrz
public CellPhones() {  //1. constrctr default// set up default values for attributes of the class
brand="iphone";	
screensize=5.8;
price=2000;
color="white";
}
public CellPhones(String brand ,double screensize,String color,long price,String model) {
	this.brand=brand;
this.color=color;
this.model=model;
this.screensize=screensize;
System.out.println(brand+""+model+color+price);
}
	




public void call(long PhoneNumber) {
		System.out.println("your phone is" + " " + brand + " " + model + "you can call it anywhere");

	}

	public void Sendmessage(long PhoneNumber) {
		System.out.println("you can send more message to" + PhoneNumber);
	}

	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
    }
	
//bu sayfada birsey test edemeyiz yeni oj eclassi acmamiz lazim

//bu void de return kullanabiliriz public static void de kullanamaiz burda static yok

}
