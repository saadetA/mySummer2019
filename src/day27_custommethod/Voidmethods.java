package day27_custommethod;

public class Voidmethods {
	public static void main(String[] args) {
myfirstmethod();
	even1to100hundred();	
	}
//myfirstmethod mainin icine yazinca icndeki heseyi print eder

	public static void even1to100hundred() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;

			}
			System.out.print(i + " ");

		}

	}

	public static void myfirstmethod() {
		System.out.println("hello world");
		System.out.println("hello cybertek");
		System.out.println("hello safa");
//method must be declare with in the class you cant wrie in your method
//create ettigmiz yeni methodu main methodun icine yazmaamiz lazim

	}
}
