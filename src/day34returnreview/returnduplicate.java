package day34returnreview;

public class returnduplicate {
	 /*
    Warm up:
   1. write  a return method that can remove duplicates from a string
       Ex: RemoveDup("abcabc") ==> returns "abc";
   2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
       Ex: count("abcaba")  ==> returns 3 ;
   3. use the above two methods to write a new method that can find the frequency of characters
       Ex: frequency("aabcabcabc") ==>a4b3c3
   4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
   5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)
    */
   
   public static void main(String[] args) {
       
       String a = RemoveDup("abcabcdefdef");   // "abc"
       
       System.out.println(a);
       System.out.println( RemoveDup("abcabcdefdef") );
       
   }
   
   // task01
   public static String RemoveDup(String str) {
                                   //"abcabc"
       String result = "";
       for(int i=0; i < str.length(); i++) {
           if( ! result.contains( str.substring(i, i+1) ) ) {
               result += str.substring(i, i+1);
           }
       }
       
       return result;
   }
}
