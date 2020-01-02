package day37_classAndObject;

public class Car {

	//ittirbiues
    String Model;
    int Year;
    String Color;
    double price;
    long milage;
    String Brand;
    
    
    //actions
    public void drive() {//instance methodlar 
    System.out.println("Driving"+Brand); 
    }
public void start() {
	System.out.println(Brand+"is started");	
}
public void getinfo() {//print all information of car
	System.out.println(Year+" "+Brand+" "+Model+" ,"+Color+","+"$"+price);//2002toyota corolla,white.1000$
}

public void buynewcar() {
	System.out.println(" i want to buy"+" "+Brand+" "+Color+" "+"car");
}



}
