package day43java_recap;

public class EncapsulationShortcut {

private int age=10;//click right source generate getter setter select
private int id=29;
private int number=166;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
/*
shortcuts for getter and setter:
	1. declare private datas
	2. right click -> source -> Genrate getters and setters
	3. select the instance variables you wanna generate getters and setters with
	4. click generate button
	
*/



}
