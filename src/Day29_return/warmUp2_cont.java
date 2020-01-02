package Day29_return;

public class warmUp2_cont {
    public static void main(String[] args) {
        
        /*Warm up:
        1. write a method that can find the frequency 
        of characters in String.
      Ex: 
          FrequencyTest("XXXYYYZZZ")
          output: X3Y3Z3 
     */
        String str="aabbbccccc";
        //expected result="a2b3c4"
        String expectedResult="";
        for(int j=0; j<str.length();j++) {
        int count=0;
        for(int i=0; i<str.length();i++) {
            if(str.charAt(i)==(str.charAt(j))) {
                count++;
            }
        }
        expectedResult+=""+str.charAt(j)+count;
        str=str.replace(""+str.charAt(j),"");
        }
        System.out.println(expectedResult);
    }
}
