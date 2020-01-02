package day42_OOp;

public class Cybertek {
public static void main(String[] args) {
	
EmplooyeInfo ibrahim=new EmplooyeInfo();
//name
ibrahim.setName("ibrahim");
//System.out.println(saadet.Name);comp error verir get cagirmz lazim
ibrahim.getName();
System.out.println(ibrahim.getName());

//ssn
ibrahim.setSSN(12345);//degistirdik okumak icin gettter lazim
ibrahim.getSSN();
System.out.println(ibrahim.getSSN());


//age
byte Age=43;
ibrahim.setAge((byte) 43);//bunu okuyamayiz 
ibrahim.getAge();
System.out.println(ibrahim.getAge());//
//salary
ibrahim.setSalary(120.000);
ibrahim.getSalary();
System.out.println(ibrahim.getSalary());
System.out.println("=========================");
EmplooyeInfo saadet=new EmplooyeInfo();
saadet.setName("saadet");
saadet.setSSN(226366366);
saadet.setAge((byte)40);
saadet.setSalary(130.000);
System.out.println(saadet.getName());
System.out.println(saadet.getAge());
System.out.println(saadet.getSalary());
System.out.println(saadet.getSSN());

}



}
