package day43java_recap;

public class staticKeyword {
String InsName="safa";//inst verb
static String stName="celil";//stat verb

public static void main(String[] args) {//st methd
	//System.out.println(InsName);insverb comp er verir cunku static degil
System.out.println(stName);//static old icin calisir

}

public void printName(){//inst methd ikisinide alir
System.out.println(InsName);	
System.out.println(stName);
}

public static void printName2() {
	System.out.println("saadet");
}

public String InsName2 ="Filiz";
 
public static String StaName = "Nurzat";

public static void printN() {
    //System.out.println(InsName2);  // static only accepts static
    System.out.println( StaName ); // static only accepts static
    
}

public void printN2() {
    System.out.println( InsName2 );
    System.out.println( StaName  ); // class members are always accepted
}







}
