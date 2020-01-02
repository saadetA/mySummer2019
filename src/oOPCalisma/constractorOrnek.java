package oOPCalisma;

import java.util.Scanner;

class book {
	String yazar;
	int sayfano;
	String kitapadi;
	String basari;
//attrb
//action
//access modfr
//getter setter
//constrctr default deger almamak icin kendi 
//degerlerini olusturmak icin
//method olusturabilirsin

	public book() {
		
		System.out.println("ilk bos constrctr calisiyor");
		this.yazar = "bos";
		this.sayfano = 0;
		this.kitapadi = "bos";
		this.basari = "bos";
System.out.println(yazar+kitapadi+sayfano+basari);
	}

public book(String yazar,String kitapadi,int sayfano,String basari) {
	this.yazar = yazar;
	this.sayfano = sayfano;
	this.kitapadi = kitapadi;
	this.basari = basari;	
System.out.println(yazar+"\n"+kitapadi+"\n"+sayfano+"\n"+basari);
}

}

public class constractorOrnek {
	public static void main(String[] args) {
//obj create edilir	
//methd cagrilir
//objlere deger atanir

	book book1=new book();
	System.out.println("parametreli constractor calisiyor");
	book book2=new book("saadet","yeni hayat",3,"basari");
	
	book book3=new book();
	
	Scanner input=new Scanner(System.in);
	System.out.println("kitap yazari");
	book3.yazar =input. nextLine();
	System.out.println("kitap adi");
	book3.kitapadi=input.nextLine();
	
	}
}







