package REPL;

public class ikinciyol_166 {
	/*When gears merge and work together, one teeth from each one goes in order.
	Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

	s1 ==> "12345"
	s2 ==> "abcde"
	mergeStrings(s1,s2) ==> "1a2b3c4d5e"

	mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

	mergeStrings("java", "selenium") ==> "jsaevlaenium"
*/
	
	
	
	
	
	
	
	public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));
        //                                   // jsaevlaenium
        System.out.println(mergeStrings("hello","www", " "));
    }

    public static String mergeStrings(String one, String two){
                                    // 12345      abcde
        String mergedString= "";

        if(one.length()>=two.length()){
            while(two.length()>0){
                mergedString += "" + one.charAt(0);
                mergedString += "" + two.charAt(0);
                one = one.replaceFirst("" +one.charAt(0), "");
                two = two.replaceFirst("" + two.charAt(0), "");
            }
            mergedString += one;
        }else if(two.length() > one.length()){
            while (one.length() >0){
                mergedString += "" + one.charAt(0);
                mergedString += "" + two.charAt(0);
                one = one.replaceFirst("" + one.charAt(0), "");
                two = two.replaceFirst("" +two.charAt(0), "");
            }
            mergedString += two;
        }


        return mergedString;
    }
    public static String mergeStrings(String one, String two, String useless){
        //                               hello    www
        String mergedString = "";
        int longString = (one.length()> two.length())? one.length():two.length();

        for(int i = 0; i<longString;i++) {
            if(i<one.length()) {
                mergedString += "" + one.charAt(i);
            }
            if(i<two.length()) {
                mergedString += "" + two.charAt(i);
            }
        }

        return mergedString;
    }
}
