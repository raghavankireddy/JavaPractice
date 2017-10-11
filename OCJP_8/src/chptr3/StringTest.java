package chptr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));

		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse")
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");

		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		// total += letters.substring(6, 5).length();
		System.out.println(total);

		StringBuilder b = new StringBuilder("rumble");
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);

		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);

		// String[] names = { "Tom", "Dick", "Harry" };
		// List<String> list1 = names.asList();
		// list1.set(0, "Sue");
		// System.out.println(names[0]);

		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
			System.out.println("A");
		else if (one.equals(two))
			System.out.println("B");
		else
			System.out.println("C");

		int num = 4;
		int val = newNumber(5);
		System.out.println(val);
		
		
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name);
		
		int number = 1;
		int val1 = number(number);
		System.out.println(val1);
	}

	public static int newNumber(int num) {
		return num = 8;
	}
	
	
	public static void speak(StringBuilder s) {
		s.append("Webby");
	}
	
	public static int number(int number) {
		number++;
		return number;
	}
}
