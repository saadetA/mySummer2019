package Day21While_do;

public class warmup2 {
public static void main(String[] args) {

String words ="Cybertek is school, Cybertek is great, I love Cybertek";
//  index:      i,  i+7
// substring (i, i+7+1)    ending index is excluded in substring
    int nTimes = 0;
    for(int i = 0; i < words.length()-7; i++) {
        //                  
        if(words.substring(i  ,  i+8 ).equals("Cybertek")) {
            //                   i+7
            nTimes++;
        }
        
    }
    
    System.out.println(nTimes);
    
    
    /*
     write a java program that can remove duplicated values from String
        EX:
            input: aabbcc
            output: abc
     */
    
        String s1 = "aabbcc";
        //           i
        //  a:  (0, 1)  
    //          (i, 1+1)
        String result = "";  //abc  // to store the new String value that does not have duplicates
        
        for(int i=0; i < s1.length(); i++) {
            if(! result.contains( s1.substring(i, i+1) )) {
                //                          (5, 6) ==> c
                result += s1.substring(i, i+1);
            }
        }
        System.out.println(result);
        
}
}
