package day34returnreview;

public class task3 {
	/* 3. use the above two methods to write a 
	 * new method that can find the frequency of characters
     Ex: frequency("aabcabcabc") ==>a4b3c3
     */
     
     public static void main(String[] args) {
         //task01
         String a = RemoveDup("abcabcdefdef");   // "abc"
         
         System.out.println(a);
         System.out.println( RemoveDup("abcabcdefdef") );
         
         
         // task02
         int count  = count("abaacdabcdaaa", "c");
         System.out.println(count);
         
         System.out.println( count("abaacdabcdaaa", "a"));
         
         
         
         
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
     
     
     // task02
     public static int count(String str1, String str2) {
                             // abab        a   ==>1
                             // bab          a  ==. 2
             
         int count=0;  //  to count how many time b is appeared in a
         
         while(str1.contains(str2)) {
             count++;
             str1 = str1.replaceFirst(str2, "");
         }
             
         return count;   
         
     }
     
     
     // task03
     public static String frequency(String str) {
                                 // "abcabcabc"  ==> "a3b3c3"
                                     
         String nonDup = RemoveDup(str); // "abc"
         String result = "";  // to store the expected result
         
         for(int i=0; i < nonDup.length(); i++) {
                 int count = count( str ,  ""+nonDup.charAt(i) );
                 result += "" + nonDup.charAt(i) + count;
         }
             
         return result;
     }
     
     
     
     












}
