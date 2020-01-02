package day23arry;

public class longestWord2 {
	public static void main(String[] args) {

		// Print the shortest word and its index in a string array . Void Methoda
		// yaptiralim.

		String[] list = { "Ali", "Java", "Computer", "School", "Automation", "Su" };

		printShortestWord(list);

		// Output: Automation ,4
	}

	public static void printShortestWord(String[] words) {

		String shortest = words[0]; // farzedelim

		int index = 0;

		for (int i = 1; i < words.length; i++) {

			if (words[i].length() < shortest.length()) { // 10>8

				shortest = words[i]; // update your longest

				index = i; // update the index of longest
			}

		}
		System.out.println(shortest + ", " + index);

	}

}
