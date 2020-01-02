package oOPCalisma;
/*
Public: Herkesin erişimene açık olan değişkenlerdir.
Private: Bulunduğu class içerisinde erişim sağlanabilen değişkenlerdir.
Protected: Bulunduğu paket veya miras alma yöntemi ile (extends) erişim 
sağlanabilen değişkenlerdir.
Default: Aynı pakettekilerin erişim sağlayabildiği değişkenlerdir. 
Kodları dikkatli incelediyseniz, şuana pckage private diyebiliriz
kadar bu erişim belirleyicisini kullandığımızı farketmişsinizdir.


*/
class Hayvan{
String name;//same pakace  default	
public String zoo;//enywhwre
private int cipno=123;//inclass getter setter
protected String cins;//same pakage can be extend(miras)

public void setcipno(int cipno) {
	this.cipno=cipno;
}
public int getcipno() {
	return cipno;
}

public Hayvan(){
	this.cins="bos";
this.name="tanimlanmadi";
this.zoo="belli degil";
}

public Hayvan(String name,String zoo,String cins) {
	this.name="toplu constrc nami";
this.zoo="topl cons zoo";
this.cins="topl const cins";
}



}




public class AccessModifers {
public static void main(String[] args) {
	Hayvan hayvan1=new Hayvan();
hayvan1.cins="van";
hayvan1.name="kedi";
hayvan1.zoo="plano";
hayvan1.setcipno(250);
System.out.println("bugunku hayvanimiz: "+hayvan1.name+"\ncinsi: "+hayvan1.cins+"\nhayvanat bahcesi: "
		+hayvan1.zoo+"\nhayvanin cip nosu: "+hayvan1.getcipno());

Hayvan hayvan2=new Hayvan();
Hayvan hayvan3=new Hayvan("kopek","kedi","kus");
System.out.println(hayvan2.name);
hayvan3.name="kopek";
System.out.println(hayvan3.name);

method1(); 


}
public static void method1() {
	Hayvan hayvan3=new Hayvan("kopek","kedi","kus");	
System.out.println("kopek kedi kus");	


}

}
