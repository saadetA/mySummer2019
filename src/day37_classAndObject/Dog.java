package day37_classAndObject;

public class Dog {    //bu syfada attribues actions ve metodlar var
/*
Attributes/data
breed,size,age,color,name,gender
actions:eat,sleep,bark,play
*/

String breed;
String size;
byte age;
String color;
String name;
char Gender;
String food;
public void getinfo() {
	System.out.println(breed+" "+size+" "+age+"years old"+" "+"her color is"+color);
}

public void eat() {//eat action gibi bircok action yazip custom metodunuzu yazabilirsiniz
System.out.println(name+" "+"is eating"+" "+food);	
}
public void play() {
	System.out.println(breed+"is playing");
}







}
