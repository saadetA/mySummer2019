package day45Inheritance;

public class InheritancePractice extends ParentClass {
	public static void main(String[] args) {
//System.out.println(username);//privete alamayiz	
		System.out.println(password);
		System.out.println(age);
		System.out.println(salary);

	}
}
//extends yapinca parenttaki tum variabllari aliyoruz
//importta sadece classa ulasabiliyoruz
//main burda olmali


/*
public class ParentClass {
	private static String username = "saadet";// extend edemiyoruz
	protected static String password = "1234";//
	public static int age = 20;//
	static double salary = 1000.000;//
}





*/






//classi extend ettigimiz zaman baska packade olsa bile gidip aliyor privete disinda