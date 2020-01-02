package day44AccessModifers;

import static day44AccessModifers.TestData.*;

//import static day44AccessModifers.TestData.Name;
//             packagename classname staticveriabl yaparsak classta
//sadece ismoiyle kullanabiliriz 
public class Test {
	public static void main(String[] args) {
		System.out.println(TestData.Name);
//or you can import class
//import static day44AccessModifers.TestData.Name;
//import ettikten sonra 
//System.out.println(Name);
//tum static memberlari import etmek icin
//import day44AccessModifers.TestData.*;
		System.out.println(ID);
		System.out.println(SchoolName);
//private buraya cagirmak icin object cretae etmem lazim
		DefaultAccsec_modifer saadet = new DefaultAccsec_modifer();
		System.out.println(saadet.NameDefault);// baska packagede olsa cagiramam
		System.out.println(saadet.namePublic);
//System.out.println(saadet.namePrivate);err verir class disinda cagirmyz
	}
}
