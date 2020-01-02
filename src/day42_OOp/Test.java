package day42_OOp;

public class Test {//burda obj create etmemz lazim

public static void main(String[] args) {
	TestData obj1=new TestData();//constrc bununla tum instance veconstr veriab cagirabiliriz
System.out.println(obj1.Name);

String str=obj1.getname1();
//private olunca tum ozellik classin icinde kalir
//buraya celil yazdiramayiz cunku classin disina cikmaz
//the data name is private we cant access it
//encapsulation deniyor private ona erisilmesini engelliyor
//bunlari getrmek icin encaps icinde getter ve setter meth  var
//celil ismini getirmek icin getter bir instance methd can read our pravete date
//returns the private data
//getter(read)only private outside the class
//must use public to access it outside the class
 System.out.println (obj1.getname1());

System.out.println(obj1.getID());
int a=obj1.getID();
//setter
obj1.setName("sibel");
//System.out.println((obj1.setName("sibel")));//degistirdik ama okuyamiyoruz
//System.out.println(obj1.getname());

obj1.setID(900);
System.out.println(obj1.getID());


}




}
