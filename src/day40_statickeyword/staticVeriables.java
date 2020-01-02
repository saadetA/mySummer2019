package day40_statickeyword;

public class staticVeriables {
//static veriables create in class outside the method
static String name;//shared by class and all future objects
                   //can be one copy
//veriable i class ismiyle cagiriyoruz	
static double staticNum;	
	public static void main(String[] args) {
	
staticVeriables obj1=new staticVeriables();
obj1.name="omer";

staticVeriables obj2=new staticVeriables();
System.out.println(obj2.name);

staticVeriables obj3=new staticVeriables();
obj3.name="saadet";//burda name i artik saadet yapiyoruz degistirmezsek hep saadet kalir
System.out.println(obj3.name);//class ta artik name saadet oldu

System.out.println(obj1.name);//burdada saadet verir ama enyukardaki omer kalir
//burda string degisiyor static olunca.ama final keybord olursa immtuble olur

System.out.println("=====================");
System.out.println(staticVeriables.staticNum);//class ismiyle cagirdik eger instance olsa class ismiyle degil sadece objet ismiyle cagirabilirdik	
staticVeriables object1=new staticVeriables();//0.0 verir daha birdeger vermezsek	
	object1.staticNum=4.5;
System.out.println(object1.staticNum);	
	
	staticVeriables object2=new staticVeriables();
System.out.println(object2.staticNum);	
	
	
staticVeriables object3=new staticVeriables();
object3.staticNum=8.0;
System.out.println(object3.staticNum);	

	staticKeyword.printHello();
	staticKeyword.method1();
	
	
	}





}
