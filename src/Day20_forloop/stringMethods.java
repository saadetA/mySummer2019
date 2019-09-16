package Day20_forloop;

public class stringMethods {
	 /*
    methods: 
        substring , indexOf, lastIndexOf, replace, replaceFirst
        equals, equalIgnoreCase,
        contains, startsWith, endsWith,
    charAt, trim, length, concat, isEmpty, toUpperCase, toLowercase
        
 */
public static void main(String[] args) {
    /*
     subString:
                creating the sub value of the String
                    ending index is excluded
     */
    
        String str ="Cybertek School";  // String literals
        
            str.substring(0, str.indexOf("k") +1 );
            
            System.out.println(str); // cybertek school, String is immutable
    
        str = str.substring(0, str.indexOf("k") +1 );
        
        System.out.println(str);  // Cybertek
        
        
        String str2 ="Cybertek School";
        
        str2 = str2.substring(str2.indexOf("S"));
        System.out.println(str2);  // school
        
        
        
        
    // index of: returns the first occured value's index number
        String s1 ="Java is a fun language, I Love java, java,";
        System.out.println( s1.indexOf("a") );  //1
        
        System.out.println( s1.indexOf("ag"));  //19
        
    // lastIndexOf(): returns the last occured char's index num
        System.out.println(s1.lastIndexOf("a")); //40
        
        System.out.println(s1.lastIndexOf("ava")); // 38
        
        System.out.println(s1.indexOf("ava,"));  //32
        
        
        // replace: replaces all the occured old value with the new one
        String name ="Cybertek School Batch 12";
            int length = name.length();
            System.out.println(length);
            
            // name = name.replace(" ", "");
            System.out.println(name.length());
            
            name =name.replace("e", "a"); // replace all e with a
            System.out.println(name);
            
            name = name.replace("School", "Family");
            System.out.println(name);
        
        
// replaceFirst: replaces the ifrst occured old character with the new one
            
        String A1 = "Java is Fun, Java is object oriented, Java is cool";
            A1 = A1.replaceFirst("Java is o", "C++ is o");
            A1 = A1.replaceFirst("d, Java", "d, C#");
            System.out.println(A1);
            
            
    /*
            == , equals,  equalIgnoreCase       
     */
            String R1 ="Cybertek";  // String pool
            String R2 =new String("Cybertek");  // heap
            
            String R3 = new String("cybertek"); // heap
            
            
            System.out.println(R1 == R2); // false, different location
            
            System.out.println(R1.equals(R2) ); //true, visibile texts are same
            
            System.out.println( R1.equals(R3) ); // false, case sensitivity
            
            System.out.println( R1.equalsIgnoreCase(R3) );
        // true, it checks the visible text without case sensitivity
            
}         
}
