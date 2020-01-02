package oOPCalisma;

public  class Account {

public String name;	
public int Age;	//instance initlz etmedik
private String lastName;
final int Id=0;//final olunca initilz ettik

public Account() {
	System.out.println("superdeki bos constractr");
}
public Account(String name) {
	System.out.println("stringli constrct");
}


public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
