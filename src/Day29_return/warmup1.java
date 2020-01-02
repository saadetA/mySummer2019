package Day29_return;

public class warmup1 {
//interview ques we have 20 mints
	/*
	 * . write a method that can find the frequency of characters in String. Ex:
	 * FrequencyTest("XXXYYYZZZ") output: X3Y3Z3 FrequencyTest("AAABBBBBCCCC")
	 * output: A3B5C4
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String str = "aabbaaabbbcccccDDaaEEE";

		// expected result: a5b5c5D2
		// letters: "abcd"

		String RemoveDup = ""; // to store the non duplicated values of the str
		for (int i = 0; i < str.length(); i++) {
			if (!RemoveDup.contains(str.substring(i, i + 1))) {
				RemoveDup += str.substring(i, i + 1);
			}
		}

		System.out.println(RemoveDup);

		// str = "aabbaaabbbcccccDD"; RemoveDup = "abcd";
		// j, j+1

		// (1, 2)
		// result = a5b5c5D2

		String result = ""; // to store the expected result

		for (int j = 0; j < RemoveDup.length(); j++) {
			int count = 0; // count the numbers of apperances
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).equals(RemoveDup.substring(j, j + 1))) {
					count++;
				}
			}
			result += RemoveDup.substring(j, j + 1) + count;

		}

		System.out.println(result);

	}

}
