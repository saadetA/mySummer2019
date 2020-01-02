package saadet_1Yeni;

import java.util.Arrays;


public class arraypractise {
	public static void main(String[] args) {
		String[] esya = { "dolap", "makina", "koltuk" };
//veya String[]esya=new String[3]; 
		esya[0] = "dolap";
		esya[1] = "makina";
		esya[2] = "koltuk";
		for (int i = 0; i < esya.length; i++) {
			System.out.print(esya[i] + " ");
		}
//veyaesya

		for (String dolas : esya) {
			System.out.println(dolas);
		}
		System.out.println("============================");
		String[][] sehirler = new String[3][3];// 9 sehir 3 bolge var
		sehirler[0][0] = " istanbul "; // 0 =1.bolge;1= 2.bolg;
		sehirler[0][1] = " bilecik "; // 2=3.bolge
		sehirler[0][2] = "bursa  "; // ilk 0 sehir ikinci bolge
		sehirler[1][0] = " ankara ";
		sehirler[1][1] = "konya  ";
		sehirler[1][2] = " nigde ";
		sehirler[2][0] = "diyarbakir  ";
		sehirler[2][1] = "elazig  ";
		sehirler[2][2] = " mardin ";

		for (int i = 0; i <= sehirler.length-1; i++) {
			System.out.println("==========================="); 
			for (int j = 0; j <=sehirler.length-1; j++) {
				System.out.println(sehirler[i] [j]);
			
		
		}
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
