package REPL;
import java.util.ArrayList;
public class repl187Cozum {

	public static void main(String[] args) {

		ArrayList<String> wordList1 = new ArrayList<>();
		ArrayList<String> wordList2 = new ArrayList<>();

		
		ArrayList<String> list3=new ArrayList<String>();
	
		list3=combineAl(wordList1, wordList2);

		System.out.println(list3);
		}


	private static ArrayList<String> combineAl(ArrayList<String> list1, ArrayList<String> list2) {

		ArrayList<String> list3=new ArrayList<String>();

		for (int i = 0; i < list1.size(); i++)
			list3.add(list1.get(i));

		for (int i = 0; i<list2.size(); i++) {
			
			list3.add(list2.get(i));
		}
		
		
		return list3;
	}
}
