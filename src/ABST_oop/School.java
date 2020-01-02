package ABST_oop;

import java.util.ArrayList;
import java.util.Arrays;

import REPL.ArraylistRemove;

abstract class  teachers {
	public String name;

 public String lastName;
 private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 
 public abstract void meeting();
 
 public void getinfo() {
	 System.out.println("best teacher is "+name+" "+lastName);
 }
 
 }









public class School extends teachers{
public School(String name, String lastName,int id) {
	this.name=name;
this.lastName=lastName;


}
	

	@Override
	public void meeting() {
		System.out.println("teachers meeting are evry day");
		
	}


public static void main(String[] args) {
	School teacher1=new School("saadet","akgobek",123);

//teacher1.getinfo();
School teacher2=new School("ibrahim","akgobek",1234);
//teacher2.getinfo();

School[]teachers={teacher1,teacher2};
for(School each:teachers) {
	each.getinfo();
}

//

teachers teacher3=new School("safa", "akgbk", 3455);//parent class ref typ oldu child ile obje olustrdk
                                                     //cunku parent abstract
teachers teacher4=new School("celil", "akgobek", 567);
teachers[]yeni= {teacher3,teacher4};
ArrayList<teachers>ogretmen=new ArrayList<>();
ogretmen.addAll(Arrays.asList(yeni));
for(teachers each:ogretmen) {
	each.getinfo();
}


}









}
