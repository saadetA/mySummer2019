package day_30_Wrapper_ArraysList;
/*
/*
     1. write a return method that accepts a String and removes duplicate values from the String
    Ex:
        RemoveDuplicate("aaabbbccc") ==> "abc"
    2. write a return method that accepts String and returns the unique values from the String
    Ex: 
            Unique("AABBCDEEE")  ==> "CD"
     */




public class warmUp {
public static void main(String[] args) {
	
String str=RevDup("aaabbbccc");

  String result=uniqvolue("AABBCDEEE");
    		 System.out.println(result);
}



public static String RevDup(String str) {
String result="";
for (int i = 0; i < str.length(); i++) {
	if(!result.contains(str.substring(i,i+1))) {
		result+=str.substring(i,i+1);
	}

}
return result;
}
///AABBCDEEE
public static String uniqvolue(String str) {
	String result="";
int count=0;
for (int j = 0; j <str.length(); j++) {
	
	
for (int i = 0; i < str.length(); i++) {
	if(str.charAt(i)==str.charAt(j)) {
		              //'A'
			count++;	
	}
	
}
if(count==1) {
 result+=""+str.charAt(j);
}

}
/*solution with one loop
  int i = 0;
    while (i < str.length()) {
        if (str.substring(i+1).contains(str.substring(i, i+1)))
            str = str.replaceAll(str.substring(i, i+1), "");
        else
            i++;
    }
        


*/
return result;


}

















}
