package day17concat;



public class trim_substring {
public static void main(String[] args) {
	
	/*
    trim(): it's used for removing the unused spaces
            returns a NEW String value
    
 */
    
        String s1 ="                 hello               ";
                s1.trim();
        System.out.println(s1);
            
                s1 = s1.trim();
            System.out.println(s1);
        
        String s2 = "Cybertek            School";
            s2 = s2.trim();
            System.out.println(s2);
            
        String s3 ="    ";
            s3 = s3.trim();
        System.out.println(s3);
        
        String s4 ="       Cybertek    School";
            s4 = s4.trim();
        System.out.println(s4);
        
/*
    substring(beginning index): 
                    it creates sub value of the String from
                    the beginning index till the last index
                    and returns it as a NEW String value    
        
 */
        String Str ="Cybertek School";
        //           0123456789
        
          Str = Str.substring(9); //School
        System.out.println( Str );
        
    String Address = "Mclean VA 22000";
    //                0123456789... 
    String zipcode = Address.substring(11);
        System.out.println(zipcode);
        

/*
    substring( beginning index , ending index):
                it creates the sub value of the String from the
                beginning index till the ending index 
                (ending index num will be excluded)
                then returns it as a NEW String value
            
 */
        String Name ="Hello Cybertek School";
        //            0123456789......
            Name =  Name.substring(6, 14); //"Cybertek"
            System.out.println(Name);
            
        String fullName ="Cybertek School Batch12";
        //                0123456789
        String middleName = fullName.substring(9,14+1); // School
        System.out.println(middleName);
        













}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
