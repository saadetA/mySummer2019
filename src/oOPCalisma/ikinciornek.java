package oOPCalisma;

class cocuk{
	String isim;
int yas;
String okul;
//action
int calismasaati;
void efor(int calismasaati) {
	this.calismasaati+=calismasaati;
}


}

public class ikinciornek {

public static void main(String[] args) {
	cocuk cocuk1=new cocuk();
cocuk cocuk2=new cocuk();
	cocuk1.isim="celil";
cocuk1.okul="allenhigh";
cocuk1.yas=15;
cocuk2.isim="safa";
cocuk2.okul="norton";
cocuk2.yas=10;
System.out.println("cocuk ismi "+cocuk1.isim+"\nokulu :"+cocuk1.okul
		+"\ncocukyas :"+cocuk1.yas);

cocuk1.efor(5);
System.out.println(cocuk1.isim+"in calisma saati:"+cocuk1.calismasaati);
cocuk2.efor(2);
System.out.println(cocuk2.isim+"in calisma saati:"+cocuk2.calismasaati);
System.out.println("cocuk ismi "+cocuk2.isim+"\nokulu :"+cocuk2.okul
		+"\ncocukyas :"+cocuk2.yas);

//bu ornekte veriablelarimiza obje ile ulasabiliyruz(instanse veriable)ama onune
//access modiferler gelince durum degisir public private gibi,

}


}
