package REPL;

public class repl166 {
	public static void main(String[] args) {
		
	} 
	
	public static String mergeStrings(String one, String two) {
		  
		    String str = "";
		    int longer = 0;
		    if (one.length() >= two.length())
		    {
		        longer = one.length();
		    } else
		        longer = two.length();
		    for (int i = 0; i < longer; i++)
		    {
		        if (i < one.length())
		        {
		            str += one.charAt(i);
		        }
		        if (i < two.length())
		        {
		            str += two.charAt(i);
		        }
		    }
		    return str;
		}
}
