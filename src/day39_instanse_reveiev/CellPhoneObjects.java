package day39_instanse_reveiev;

public class CellPhoneObjects {
public static void main(String[] args) {
	
CellPhones phone1=new CellPhones();
System.out.println( phone1.brand );  // 
System.out.println( phone1.color );  // 
System.out.println( phone1.model);   // 
System.out.println( phone1.price);   //
System.out.println( phone1.screensize);  //

phone1.brand="Apple";//apple yazmasydik null verirdi
phone1.color="white";
phone1.price=20000l;
phone1.screensize=12345;
CellPhones phone2=new CellPhones("apple", 7.3, "black", 3000, "new");

phone2.getInfo();
CellPhones phone3 = new CellPhones("samsung", 20, "white", 3, "3330");
phone3.getInfo();

CellPhones phone4 = new CellPhones("nokia", 7.3, "green", 3000, "old");
phone4.getInfo();
CellPhones[] phones = {phone1, phone2, phone3, phone4 };

// brand of phone3:
System.out.println( phones[2].brand );

// get info of phone3
phones[2].getInfo();
        




}







}
