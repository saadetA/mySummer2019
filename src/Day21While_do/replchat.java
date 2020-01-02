package Day21While_do;

public class replchat {
	public static void main(String[] args) {
		 
		        
		String words = "Cybertek is school,"
				// index: i, i + 7
				// substring ( i, i + 7 + 1) ending index is excluded in substring
				+ "Cybertek is great" + "I love Cybertek";

		int nTimes = 0;
		for (int i = 0; i < words.length() - 7; i++) {
			// length() - 5-1-1 = 54
			// length() - 5-1 = 55
			// so we need one more
			// length() - 5-1-1 = 54
			// for(int i = 0 ; i < words.length(); i ++) {
			if (words.substring(i, i + 8).contentEquals("Cybertek")) {
				// 53, 61
				// Q: What is the minimum index number?
				// A: i + 7
				nTimes++;
			}
		}
		System.out.println(nTimes);

	

	/*
	 * RESULT 3
	 *
	 * package week8day1; public class duplicate { public static void main(String[]
	 * args) { /* write a java program that can remove duplicated values EX: input:
	 * aabbcc output:abc
	 * 
	 */

	String s1 = "aabbcc";
	// a: (0,1)
	// (i, i+1)

	// in order to create a substring of 'a', I do (0,1)
	String result="";
	for(
	int i = 0;i<s1.length();i++)
	{
		if (!result.contains(s1.substring(i, i + 1))) {
			// (0 , 1 ) == > a
			// so then we ask, "Does this substring contain 'a'
			// (2 , 3 ) ==> b
			// (3 , 4 ) ==> b
			// (4 , 5 ) ==> c
			// the reason we add this exclamation mark is
			// b/c we add this variable if it does NOT contain a
			result += s1.substring(i, i + 1);

		            //Q: if it's false, is it going to add it?
		            //A: no
		        }
		        
		    }
		    System.out.println(result);
    }/*for (int i = 0; i < str.length()-3; i++) {//alternatif chat
            
            if (str.contains("book")) {
            numBooks++;
            str = str.replaceFirst("book", "");
            
            */
		/*
  String sentence = "I like books, I have books, I need book";
        
        //  index:          z,          z+3+1 ==> books
        
        int count = 0;
        
        for(int i = 0 ; i < sentence.length(); i ++) {
            //          16      17
            
        //  if(sentence.substring(i , i+4 ))    // substring(0,4)
            //              if i = 16, i becomes 20
            
            for(int i=0 ; i < sentence.length()-3; i++) {
                
            
            //if(sentence.substring(i , i+4 ).equals("book") ) {
                //      ending index is ALWAYS excluded
                count ++;
                //this count adds to line 9 - to keep
                //track of how many book iterations
                // there are
        //public class Repl_it2 {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    
    String word=scan.nextLine();
    String rev="";
    for(int i=word.length()-1;i>=0;i--) {
         rev+=word.charAt(i);
    }System.out.println(rev);
    
    if(rev.equals(word))
        System.out.println(true);
    else
        System.out.println(false);
   */ 
		
}		
		
		
		
		
		
		
		
