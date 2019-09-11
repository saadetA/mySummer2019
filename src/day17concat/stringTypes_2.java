package day17concat;

public class stringTypes_2 {
public static void main(String[] args) {
	  // ==
    
    String str1 ="Hello Javengers";
    String str2 ="Hello Javengers";
    boolean R1 = str1 == str2 ;  // true
    System.out.println(R1);
    
    String str3 = new String("Hello Javengers");
    String str4 = new String("Hello Javengers");
    boolean R2 = str3 == str4;  // false
    System.out.println( R2 );
    
    boolean R3 =  str1 == str3;  // false
    
    System.out.println(R3);
    
/*
 Methods:
    1. concat, 2. Length, 3. charAt, 4. toUpperCase,
    5. toLowerCase      
 
 */

/* 
 concat(str): it takes String, and combines the two Strings
    and returns it as new String Value
    
*/  
    String a ="Cybertek";
        a.concat(" School"); //  "Cybertek School"
    System.out.println(a);
        a = a.concat(" School"); //  a= "Cybertek School"
//  a = "Cybertek School";        
    System.out.println(a);
    
    String A ="hello", B ="helloP";
    System.out.println(A==B); // false, different values
    
    String C ="Hello", D ="hello";
    System.out.println(C == D); // false , case sensitivity
    
/* 
 length(): it returns the total number of the characters as
        an int value
 
 */
    String LongName ="ABCDEFGHIJKLMN";
            int num = LongName.length();
            System.out.println(num);
    
    
/*
charAt(indexNum): it returns the character of the index number
                as a char value
 
 */
        String name1 = "Muhtar";
        // index:       012345
        char ch = name1.charAt(5);
        System.out.println( ch );  // r, index 5 is r
    
/*
 toUpperCase(): converts the String value to Upper case, 
                and returns it as NEW String vlaue
                 
 toLowerCase(): converts the String value to Lower case, 
                and returns it as NEW String vlaue
 
 */
        String name2 ="cybertek";
                name2.toUpperCase(); //cybertek
             System.out.println(name2);
             
             name2 = name2.toUpperCase(); //CYBERTEK
             System.out.println(name2);
        
             
        String name3 = "CYBERTEK";
                name3.toLowerCase();
        System.out.println(name3); // "CYBERTEK"
        
                name3 = name3.toLowerCase(); //"cybertek"
        System.out.println(name3);
    
    
/*
    trim(): it's used for removing the unused spaces
    
 */
    
    





}
}
