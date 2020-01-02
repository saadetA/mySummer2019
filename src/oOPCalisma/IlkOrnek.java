package oOPCalisma;

class cat{
//0lusturdugumuz class	
int age;
String name;
String color;

int hungry;
String eat;
void  eatfood(int foodvolue) {
	this.hungry+=foodvolue;
}

}


public class IlkOrnek {

//main dosyasinda farkli classlar olustururken public kullanamayiz	
/*	
Class Mantığı
Class nesnemizin kapsamını belirten, içerisinde özellik ve 
davranışları tanımladığımız methodlardır. Class temsil ettiği 
nesneye göre bir isim alır. Main methodumuz içerisinde class 
çağırarak, nesnemizi yaşayabilir bir nesne haline dönüştüreceğiz.
 Nesnemizin canlı bir varlığa dönüşmesi program akışımızda nesneyi
  kullandığımızı 
ve artık RAM üzerinde bir alan kapladığı anlamına gelir	
	
*/	
	public static void main(String[] args) {
	//ana method
cat cat1=new cat();//cat class  ismi
cat1.color="siyah";	
cat1.name="karam";	
cat1.age=1;	
System.out.println("\tkedimizin adi: "+cat1.name+" \nkedimizin rengi: "+
cat1.color+" \n\tyasi: "+cat1.age);
cat1.eatfood(3);
	System.out.println("kedinin aclik durumu "+cat1.hungry);
	//this.hungry+=foodvolue;
	cat1.eatfood(2);
	System.out.println("kedinin aclik durumu "+cat1.hungry);
	}
	}




