package arrayList;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String args[]) {

		int[] array = { 10, 20, 30 };

		// Int Stream
		IntStream stream = Arrays.stream(array);

		// Call any match
		boolean result = stream.anyMatch(number -> number >= 19);

		System.out.println("Result of Int Stream :-" + result);

		// Double Stream
		double[] array2 = { 1.1, 1.2, 1.3, 1.4 };

		// Double Stream
		DoubleStream stream2 = Arrays.stream(array2);

		// Call any match
		boolean result1 = stream2.anyMatch(number -> number >= 1.2);

		System.out.println("Result of Double Stream :-" + result1);

		String[] array3 = { "Java", "C", "C++", "Python" };

		Stream<String> stream3 = Arrays.stream(array3);

		// Test The String

		boolean result2 = stream3.anyMatch(value -> value.length() > 4);

		System.out.println("Result of String Stream :-" + result2);

		Stream<String> stream4 = Arrays.stream(array3);

		Optional<String> value = stream4.findAny();

		System.out.println(value);

	}
}
