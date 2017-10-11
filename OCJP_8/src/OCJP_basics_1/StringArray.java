package OCJP_basics_1;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		int[] numbers = { 6, 9, 1 };

		Arrays.sort(numbers);

		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println();

		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings) {
			System.out.println(string + " ");
		}

		
		int [] number = {2,4,6,8,10};
		System.out.println(Arrays.binarySearch(number, 10));
		
	}

}
