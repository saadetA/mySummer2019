package REPL;

public class Repl_169 {
/*
This method gets a string and returns the word count of that string.

example:
wordCount("foo bar")
returns 2
wordCount("one two three")
returns 3
wordCount("bla")
returns 1
hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
*/
	public static void main(String[] args) {
		  String example = "foo bar";
	        System.out.println(wordCount(example));
	        System.out.println(wordCount("one two three"));
	        System.out.println(wordCount("bla"));
	} 
	  public static int wordCount(String words) {
		  String[] arr = words.split(" ");
	        //     [foo, bar]
	    // length    1   2
	        int count= arr.length;
	        return count;
	    }
	      
	  









	  }




