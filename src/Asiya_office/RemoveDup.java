package Asiya_office;

public class RemoveDup {
	/*Write a return method that can remove the duplicated values from String

			Ex:  removeDup("AAABBBCCC")  ==> ABC
*/
			 

public static String removeDuplicate(String str) {
String newduplicate=""	;

for (int i = 0; i < str.length(); i++) {
	
		if(!newduplicate.contains(""+str.charAt(i))){
			newduplicate+=str.charAt(i)+"";
		}
	
	
	}
return newduplicate;
}





public static void main(String[] args) {
String remvdup=	removeDuplicate("AAABBBCCC");
System.out.println(remvdup);
}












/*
 public static void main(String[] args) {

        String input = new String("abbc");
        String output = new String();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) != output.charAt(j)) {
                    output = output + input.charAt(i);
                }
            }
        }

        System.out.println(output);

    }



*/

}
