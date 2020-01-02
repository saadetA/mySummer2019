package day23arry;

public class PrintLongestWordInArray {
public static void main(String[] args) {

	// Print the longest word and its index in a string array . Void Methoda yaptiralim.
	
	String[] list= {"Ali","Java","Computer", "School","Automation"};
	
	printLongestWord(list);
	
	// Output: Automation ,4

}

public static void printLongestWord(String[] words) {
	
	String longest=words[0]; // farzedelim 
   
	int maxIndex=0;
	
	
	for (int i =1 ; i < words.length; i++) {
		
		if(words[i].length()>longest.length()) { // 10>8
			
			longest=words[i]; // update your longest
			
			maxIndex=i;  // update the index of longest
		}
		
	}
System.out.println(longest+", "+maxIndex);
	
}	
}

	
	
	
	

