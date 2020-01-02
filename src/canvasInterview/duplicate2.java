package canvasInterview;


public class duplicate2 {
//removeDup("AAABBBCCC")  ==> ABC

	 
public	static String removedup(String str) {
	String remove="";
	for (int i = 0; i < str.length(); i++) {
		int count=0;
	for (int j = 0; j < str.length(); j++) {
	if(str.charAt(i)==str.charAt(j)) {
		count++;
		
	}	
		
	}//count>1 dersek duplicatleri verir
	if(count==1) {//bu uniqleri print eder
		remove+=" "+str.charAt(i);
	}
	
	
	}	
	return remove;	
}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	String yeni=removedup(" aaabcdee");
		System.out.println(removedup(" aaabcdee"));	 

	
	}
}