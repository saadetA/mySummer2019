package volkanistekmethod;

public class codingbatstring2 {
public static void main(String[] args) {
	System.out.println(hasBad("badxx"));
System.out.println(lastChars("", "hello"));	

}


public static boolean hasBad(String str) {
	  
	  if(str.length()>=0&&str.substring(0,str.length()).contains("bad")||str.substring(1,str.length()).contains("bad")){
	   return true; 
	  }else{
	    return false; 
	  }





}

/*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
*/


public static String lastChars(String a, String b) {
	  String lastchar="";
	  
	  if(a.length()>0&&b.length()>0) {
		  lastchar=a.substring(0,1)+b.substring(b.length()-1);
	  }else if(b.length()==0){
		  lastchar=a.substring(0,1)+("@");
	  }else if(a.length()==0){
		  lastchar=("@")+b.substring(b.length()-1);
	  }else {
		 
	  }
	  return "@"+"@";
}
















}
