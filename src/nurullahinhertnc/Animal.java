package nurullahinhertnc;

public abstract class Animal {
public int age;
public int head;
public String name;

public int body;




public abstract void walk();

public void eat() {
System.out.println("eating");	
}

public Animal(int age, int head, String name, int body) {

	this.age = age;
	this.head = head;
	this.name = name;
	this.body = body;
}

public void sleep() {
System.out.println("is sleeping");
}

public void move() {
	System.out.println("is moving");//bird de override et
}


}
