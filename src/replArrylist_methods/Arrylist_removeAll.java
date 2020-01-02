package replArrylist_methods;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrylist_removeAll {


public static void main(String[] args) {
	ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
	removeAll( wordList, "hi");
}
public static void removeAll(ArrayList<String> wordList, String targetWord){
   ArrayList<String>newarr=new ArrayList<>();
    for (int i = 0; i < wordList.size(); i++) {
		if(wordList.get(i).equals(targetWord)) {
			wordList.removeAll((Arrays.asList(targetWord)));
		}
		
    }
    System.out.println(wordList);
    	
}

}   
   
   
   
   
   
   /*

/ ArrayList<String> removed = new ArrayList<>();
        for(int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).equals(targetWord)) {
                wordList.removeAll(Arrays.asList(targetWord));
            }
            
        
        }
        System.out.println(wordList);
    








Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]


*/

