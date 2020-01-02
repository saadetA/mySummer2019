package day39_instanse_reveiev;

import java.text.DecimalFormat;

public class DecimalFormatter {

public static void main(String[] args) {
	DecimalFormat format =new DecimalFormat("0.000");//buraya 0 dan baska rakameklersek 
	//rakamimiza ekler koyamayiz
double b=23.123455667;
//23.000 formatinda istersem yukrda create ettigim formlu kullanrm stringe dondrck
String num1=format.format(b);
System.out.println(num1);
double c=45.56789;
System.out.println(format.format(c));//bize string verir ama bunu doubla cevirmem lazim wrapprdan
//cekeriz
System.out.println(c+1);
c=Double.parseDouble(format.format(c));
System.out.println(c);//burda artik string degil numraya dondu
System.out.println(c+1);
}
//ozet :format metodunu kullaninca uzun decimaliin son birkac rakamini aliriz fakat string olarak
//onu tekrar rakama cevirmek icin ya parse y a da volue of kulanmamiz lazim


}
