package day44AccessModifers;

public class TestData {// visible everywhere
	public static String Name = "juline";
	public static String ID = "007";
	public static String SchoolName = "norton";
	private static String adress = "allen";// set get//only visible in class

	static int age = 20;// default wccses modifer sadece ayni package icinde
//kullanilir baska package icinde kullanilamaz day 43 packagede calisir public 
//heryerde private kendi classinda
	static double salary = 100000.3;

	public static void printhello() {
		System.out.println("hello");
	}

}
