package day42_OOp;

public class EmplooyeInfo {
private String Name;
private long SSN;
private byte Age;
private double Salary;

public void setName(String Name) {//name icin setter ve getter
	this.Name=Name;
}
public String getName() {
	
return  Name;
}
//==============//ssn
public void setSSN(long SSN ) {//setter
	this.SSN=SSN;
}
public long getSSN() {//getter
	
	return SSN;//this istersen kullanabilirsin sart degil cunku parametrede verilmedi
}

//age
public void setAge(byte Age) {
	this.Age=Age;
}

public byte getAge() {//byte oldugu icin paramtr 
	
return Age;
}

//salary
public void setSalary(double Salary) {
	this.Salary=Salary;
}

public double getSalary() {
	return Salary;
}
public void setInfo(String Name, long SSN, byte Age, double Salary) {
    this.Name = Name;
    this.SSN = SSN;
    this.Age = Age;
    this.Salary = Salary;
}

//getInfo
public void  getInfo() {
    System.out.println(Name);
    System.out.println(SSN);
    System.out.println(Age);
    System.out.println(Salary);
}

//to test it on AmericanAirlines

//EmployeeInfo name = new EmployeeInfo();

//name.setInfo("Nurzat", 789750883L, (byte)100, 200000);
//name.getInfo();





}
