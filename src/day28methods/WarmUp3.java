package day28methods;

import java.util.Arrays;

public class WarmUp3 {
//kahoot sorulari
	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'c' };
		int z = ch.length; // 3
		int count = 0; // 1+2 =2

		while (count < z - 1) {
			// 2 < 2

			count++;
		}
		System.out.println(count);

		String[] arr = { "Maral", "Nurullah" };
		arr[0] = arr[1]; // [ "Nurullah", "Nurullah"]
		arr[1] = arr[0]; // [ "Nurullah", "Nurullah"]
		System.out.println(Arrays.toString(arr));

		int nums[] = { 5, 4, 3, 2, 1 };

		for (int each : nums) {

			if (each == 3) {
				continue;
			}

			System.out.print(each + " "); // 5 4 2 1
			break; // 5

		}

		System.out.println();

		char[] characters = { 'a', 'b', 'c' };
		for (char each : characters) {
			/*
			 * if(each == 'b') continue; // a c
			 */

			System.out.print(each + " ");

			if (each == 'b')
				continue; // abc

		}
		System.out.println();

		long[] Arr = new long[2]; // [0, 0]
		Arr[0] = 5L; // [5, 0]
		Arr[1] = 10L; // [5, 10]

		Arr = new long[4]; // [0, 0, 0, 0]
		Arr[2] = 15L; // [0, 0, 15, 0]
		Arr[3] = 20L; // [0, 0, 15, 20]
		System.out.println(Arrays.toString(Arr));

	}

}
