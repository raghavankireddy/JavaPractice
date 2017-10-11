package stream;

import java.util.Arrays;
import java.util.stream.*;

public class StreamOperations {

	public static void main(String[] args) {

		Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).map(n -> 2 * n + 1).average().ifPresent(System.out::println);

		// Stream of Strings
		Stream.of("a1", "a2", "a3", "a4").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);

		// Stream Of Int
		IntStream.of(1, 5).mapToObj(i -> "a" + i).forEach(System.out::println);

		// Stream of Doubles
		Stream.of(1.0, 2.0, 3.0, 4.0, 5.0).mapToInt(Double::intValue).mapToObj(i -> "ab" + i)
				.forEach(System.out::println);

		// Laziness of Stream - Won't Print anything
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		});

		// Now it will print the result
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		}).forEach(s -> System.out.println("forEach: " + s));

		// Complex Scenario
		Stream.of("ad2", "b2", "t1", "b3", "ac").map(s -> {
			System.out.println("map :" + s);
			return s.toUpperCase();
		}).anyMatch(s -> {
			System.out.println("anyMatch: " + s);
			return s.startsWith("A");
		});

		System.out.println("Last Scenario -------------");
		// Complex Scenario With ForEach
		Stream.of("ad2", "b2", "t1", "b3", "c").map(s -> {
			System.out.println("map :" + s);
			return s.toUpperCase();
		}).filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("A");
		})
		.forEach(s-> System.out.println("forEach: "+ s));
	
	}

}
