package day58Exepctn;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/*
1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
        parameters: double seconds
        return-type: void
        Thread.sleep();
    Note: Exceptions MUST be handled within the methods
2. write a method called "getData" that can retrieve the data from properties files
        parameters: String Key, String FilePath
        return-type: String
    Note: Exceptions MUST be handled within the methods
*/
public class Exeptionscontniu {
public static void main(String[] args) {
	

    Wait( 3 );
    System.out.println( "Batch 12");
    
    
    Properties property = new Properties();
    
    String path = "/Users/MacBook/Desktop/Data.properties ";
    
    try {
        FileInputStream file = new FileInputStream(path);
        property.load( file);
    }catch (IOException e) {
        
    }
        

    
    String Name =   property.getProperty("Name");
    System.out.println(Name);
    
    
System.out.println(   getData("Name", " /Users/MacBook/Desktop/Data.properties ")  );
    
System.out.println(  property.getProperty("URL"));


String Age = getData("Age", " /Users/MacBook/Desktop/Data.properties");

System.out.println(Age);


String URL = getData("URL", " /Users/MacBook/Desktop/Data.properties");//degistir

System.out.println(URL);
    
}

public static void Wait(double seconds) {
    
    try {
      Thread.sleep( (long)(seconds*1000) );  // 1 seconds = 1000 milliseconds
    } catch(Exception e) {  }
    
}

//desktoptakifile property.loadla propwertye ekledi File inputstreamle okudu
public static String getData(String Key, String Path) {
    
	
	Properties property = new Properties();
    
    
    try {
        FileInputStream file = new FileInputStream(Path);
        property.load( file);
        
    }catch(Exception e) {
        
    }   
    
    return property.getProperty(Key);
}





}

