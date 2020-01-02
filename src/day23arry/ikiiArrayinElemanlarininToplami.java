package day23arry;

import java.util.Arrays;

public class ikiiArrayinElemanlarininToplami {
	public static void main(String[] args) {

		double[] nums1 = { 2, 3, 5, 2, 3, 6, 8, 2, 9 };

		double[] nums2 = { 3, 5, 3, 8, 12, 2, 3, 4, 45 };

		// bu iki arrayin elemanlarinin toplamini baska bir array olarak donen method

		// return method sumArrays;
		// output

		// [5,8,8,10,15,8,11,6,54]

		double[] sum = new double[nums1.length];

		sum = sumArrays(nums1, nums2);

		System.out.println(Arrays.toString(sum));

	}

	private static double[] sumArrays(double[] list1, double[] list2) {

		double[] result = new double[list1.length];

		for (int i = 0; i < list1.length; i++) {

			result[i] = list1[i] + list2[i];
		}

		return result;
	}
}
