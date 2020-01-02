package day37_classAndObject;

public class CarObjects {

public static void main(String[] args) {
	
   Car        car1 =new        Car();
//classname  obj     keybord    constractor
//assign etmedigimiz birsey cagirirsak null verir
car1.Brand="Bmw";
car1.Color="white";
car1.milage=100000;
car1.Model="X6";
car1.price=1500000.5;
car1.Year=2000;
System.out.println(car1.Brand);//BMW
System.out.println(car1.Color);
System.out.println(car1.milage);
System.out.println(car1.Model);
System.out.println(car1.price);
System.out.println(car1.Year);
//ikinci obj create edelim

Car car2 =new Car();
             // existing constrctr
System.out.println("========================================");
System.out.println(car2.Brand);//null verir cunku birsey atamadik no initilaze any volue

car2.Brand="Toyota";
car2.Model="Corolla";
car2.Color="Black";
car2.milage=150000;
car2.Year=2002;
car2.price=2000;//car2.price=car2.year da yazabiliriz rakam ayniysa ve casting pluyorsa


System.out.println(car2.Brand);
System.out.println(car2.Model);
System.out.println(car2.Color);
System.out.println(car2.Year);
System.out.println(car2.price);
System.out.println(car2.milage);
System.out.println("=========================");

car1.drive();//bmw
car2.drive();//toyota


car1.start();
car2.start();

System.out.println("========================");
car2.getinfo();
//metod cagirinca syso ya gerek yok
car2.buynewcar();
car1.buynewcar();

System.out.println("=====================");
//yeni obj create ediyoruz

Car car3  = new Car();
car3.getinfo();//dersem null verir initilaze etmedigimiz icin default volue

car3.Brand="lexus";
car3.Model="RX350";
car3.Color="Blue";
car3.milage=150000;
car3.Year=2002;
car3.price=2000;

car3.getinfo();//initilize edince print ediyor

}








}
