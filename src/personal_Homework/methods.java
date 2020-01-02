package personal_Homework;
import java.util.ArrayList;
import java.util.Arrays;
public class methods {
public static void main(String[] args) {			
//String result=	removedup("aaabbbcc");
//String result=	removed("bbbbbddddeee");
	System.out.println(result);
System.out.println(removed("bbbbbddddeee"));
	System.out.println(removedup("aaabbbcc"));
	ArrayList<String>names=new ArrayList<>(Arrays.asList());
names.add("saadet");
names.add("maral");
names.add("ayse");
names.add("melek");
names.add("saadet");
names.add(5,"ali");

int a=names.size();
System.out.println(names);

System.out.println(a);

boolean c=names.contains("saadet");
System.out.println(c);
boolean e=names.isEmpty();
System.out.println(e);

	


//System.out.print(names.get(i)+" ");
System.out.println(names.indexOf("saadet"));
System.out.println(names.lastIndexOf("saadet"));

int[]sinif= {1,2,3,4,5};
ArrayList<Integer>yenisinif=new ArrayList<>(Arrays.asList(1,2,3,4,5));
yenisinif.add(6);
yenisinif.add(7);
System.out.println(Arrays.asList(yenisinif));

//1. write a return method that accepts a String and removes duplicate values from the String
		  
		 //     RemoveDuplicate("aaabbbccc") ==> "abc"
		 // 2. write a return method that accepts String and returns the unique values from the String
		  
		      //    Unique("AABBCDEEE")  ==> "CD"
}

public static String removedup(String j) {
//String eski="aaabbbccc";//abc	
String result="";
for (int i = 0; i < j.length(); i++) {
	
     
		if(!result.contains(j.substring(i,i+1))) {
		result+=j.substring(i,i+1);
		}			
}		
return result;
	
}

public static String removed(String son) {
String result="";	
for (int t= 0; t< son.length(); t++) {
	if(!result.contains(son.substring(t,t+1))) {
		result+=son.substring(t,t+1);
	}

}





return result;
}








}
