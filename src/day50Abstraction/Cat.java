package day50Abstraction;

public class Cat extends Animal{
public Cat(char Gender, byte Age, String color, String Nickname) {
		super(Gender, Age, color, Nickname);
		
	}

//parent class constrctr must be call inthe sub class immediatly
	//cagirmazsak comp err verir

//second reason we need to call abstract methds
// Cat mycat = new Cat(Gender, Age, color, NickName);

@Override
public void Speak(String languge) {
    System.out.println(Nickname+" speak "+languge+" Language");
}
@Override
public void Eat(String food) {
    System.out.println(Nickname+" eats "+food);
}
@Override
public void Sleep(int hour) {
    System.out.println(Nickname+" sleeps "+hour+" hours");
}
@Override
public void Drink(String drinks) {
    System.out.println(Nickname+" drinks "+drinks);
}









}
