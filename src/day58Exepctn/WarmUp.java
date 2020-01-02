package day58Exepctn;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/*
 1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
            parameters: double seconds
            return-type: String
            Thread.sleep();
        Note: Exceptions MUST be handled within the methods
    2. write a method called "getData" that can retrieve the data from properties files
            parameters: String Key, String FilePath
            return-type: String
        Note: Exceptions MUST be handled within the methods




*/
public class WarmUp {
public static void main(String[] args) {
		
		Wait( 3 );
		System.out.println( "Batch 12");
		
		
		Properties property = new Properties();
		
		String path = "/Users/MacBook/Desktop/Data.properties";
		
		try {
			FileInputStream file = new FileInputStream(path);
			property.load( file);
		}catch (IOException e) {
			
		}
			
	
		
		String Name =	property.getProperty("ID");
		System.out.println(Name);
		
		
	System.out.println(   getData("Name", "/Users/MacBook/eclipse-workspace/Summer2019_Java/TestData.properties")  );
		
	System.out.println(  property.getProperty("URL"));
	System.out.println(getData("Gender","/Users/MacBook/eclipse-workspace/Summer2019_Java/TestData.properties"));
	
	String Age1 = getData("Age", "/Users/MacBook/eclipse-workspace/Summer2019_Java/TestData.properties");
	System.out.println(Age1);
	//eger file  ayni projenin icindeyse tum pathi yazmak zorunda degiliz sadece file ismiyeter url deki ornek
	
	String URL = getData("URL", "TestData.properties");
	
	System.out.println(URL);
	//testData2 dosyasindaki urli cagirmak icin	location proprt sden copy yapabiliriz ama filedan sonrasi yeterli
	
String URL2=getData("URL","/Users/MacBook/eclipse-workspace/Summer2019_Java/files/TestData2.properties");

System.out.println(URL2);

}
	
	public static void Wait(double seconds) {
		
		try {
		  Thread.sleep( (long)(seconds*1000) );  // 1 seconds = 1000 milliseconds
		} catch(Exception e) {  }
		
	}
	
	//get data custom methodunu utilitiese koyup dosyalarimizi okutabiliriz
	public static String getData(String Key, String Path) {
String data="";
		Properties property = new Properties();
		
		
		try {
			FileInputStream file = new FileInputStream(Path);
			property.load( file);
			
		}catch(Exception e) {
			
		}	
		data=property.getProperty(Key);
		return data;
	}
	
	 







	 }

