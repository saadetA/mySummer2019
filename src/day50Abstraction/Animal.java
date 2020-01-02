package day50Abstraction;

public abstract class Animal {//constrctr ve abstrctr methdlar var burasi parent abstrac class

public char Gender;
public byte Age;
public String color;
public String Nickname;
//i need to create a constractor whith four argument
//parent constrctr hast to be called by sub class
public Animal(char Gender,byte Age,String color,String Nickname) {
	this.Gender=Gender;
this.Age=Age;
this.color=color;
this.Nickname=Nickname;
//these are our attribt

}
//actions
//hepsi icin action degisecegi icin abstract method olusturuyoruz (ignore implementation)

//acces modf abstract return typ name(parameter)
//acces modf=public protected default
//return typ=void,primitives,non primitives(object)
//name
//no body becs it doesnt interest detail of implementation of action
public abstract void Speak(String language);//tek ozellik tum ayri kedilere bu genel
public abstract void Eat( String food);
public abstract void Sleep(int hour);
public abstract void Drink(String drinks);

public void getInfo() {//zoo da butun ozellikler detaylar tek kediye bu yuzden get info meth
	//burdaki constrctri zoodaki objeyle cagiriyoruz

// doldur
	 System.out.println("NickName is "+Nickname);
     System.out.println("Gender is "+Gender);
     System.out.println("Color is "+color);
     System.out.println("Age is "+Age);
     System.out.println("====================================");

}



}
