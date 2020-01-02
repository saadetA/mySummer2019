package volkanistekmethod;

public class Stringcodingbat {
	/*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.


			right2("Hello") → "loHel"
			right2("java") → "vaja"
			right2("Hi") → "Hi"
	
	*/
	
	
public static void main(String[] args) {
	
System.out.println(right2("code"));

//cat c-0 a 1 t 2
	System.out.println(theEnd("1234",true));	
	System.out.println( withouEnd2("abc"));
	
	System.out.println(middleTwo("Practice")); 
//	System.out.println(twoChar("java", 3));	  
	System.out.println(middleThree("solving"));
	
	}

public static String middleTwo(String str) {
	if(str.length()>=2&&str.length()%2==0) {
		 str=str.substring(str.length()/2-1,str.length()/2+1);
	}
	return str;	
	}

public static String right2(String str) {
	  String right1="";
	if(str.length()>=2) {
	 Object substring;
	right1= str.substring(str.length()-2)+str.substring(0,str.length()-2);
	  
	
	  }

	  return right1; 
}

/*
Given a string, return a string length 1 from its front, 
unless front is false, in which case return a string length 1 from its back.
 The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
*/

public static String theEnd(String str,boolean front) {
	// str="";
front=true;
String theEnd="";
if(str.length()>0&&front==true) {
	theEnd=""+str.charAt(0);
}else if(str.length()>0&&front==false) {
	theEnd=""+str.charAt(str.length()-1);
}else {
	theEnd=str;
}

return theEnd;

}
//ikinciyol

/*
public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }


*/

/*

Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
*/


public static String withouEnd2(String str) {
	String str1="";
	if(str.length()>0&&str.length()>2) {  
//String charAt;
str1=str.substring(1,str.length()-1);
	
	}else if(str.length()<=0||str.length()==0) {
		str1="";
	} 
  
  return str1;
}

//ikinciyol
/*

public String withouEnd2(String str) {
  if (str.length() <= 2) {
    return "";
  }
  
  return str.substring(1, str.length()-1);
  
  // Solution notes: First screen out the length <= 2 case -- the result
  // must be "" then. Otherwise, just return substring(1, len-1)
  // and no length checks are required.
}


*/


public static String middleThree(String str) {
if(str.length()%2!=0&&str.length()>=3) {
	str=str.substring(str.length()/2-1, str.length()/2+2);
}	
return str;
}


public static boolean hasBad(String str) {
	  
	  if(str.length()>=0&&str.substring(0,str.length()).contains("bad")||str.substring(1,str.length()).contains("bad")){
	   return true; 
	  }else{
	    return false; 
	  }











}


}
