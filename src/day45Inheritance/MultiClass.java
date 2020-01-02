package day45Inheritance;

public class MultiClass {
	public static void main(String[] args) {
		System.out.println("main public class");
	}
}

//bur
//aya default access modifer ile istedigmiz kadar class creat edebiliriz
//ilk create ettigimiz class java file ve icine baska public crete edemeyiz 
//create ettiklerimiz defaulttur ana public class java file olmaliF
class A {
	public static void main(String[] args) {
		System.out.println("default class A");
	}
}

class B {
	public static void main(String[] args) {
		System.out.println("default class B");
	}
}
