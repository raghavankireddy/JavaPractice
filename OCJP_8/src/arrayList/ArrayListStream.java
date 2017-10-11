package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(10000);

		// Get a stream from the ArrayList
		Stream<Integer> stream = list.stream();

		boolean result = stream.allMatch(value -> value > 5);
		System.out.println(result);

		System.out.println(list.stream().max(Integer::compare).get());
		

		System.out.println("Values Greater than 12 :-");
		list.stream().filter(n -> n > 12).forEach(System.out::println);
		
		
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		System.out.println("String Collection :-");
		stringCollection
		.stream()
		.sorted()
		.filter((s) -> s.startsWith("a"))
		.forEach(System.out::println);
		
		
		System.out.println("String Collection Comparison :- ");
		stringCollection
		.stream()
		.map(String::toUpperCase)
		.sorted((a,b) -> a.compareTo(b))
		.forEach(System.out::println);
		
		System.out.println("Reduced Operation");
		
		Optional<String> reduced = 
				stringCollection
				.stream()
				.sorted()
				.reduce((s1,s2)-> s1+"#"+s2);

		reduced.ifPresent(System.out::println);
	}

}
