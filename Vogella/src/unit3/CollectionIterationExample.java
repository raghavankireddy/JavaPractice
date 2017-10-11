package unit3;

import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import lambda_Exercise.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Darwin", 7), new Person("Lewis", "Carol", 70),
				new Person("Thomas", "Creouton", 17), new Person("Michelle", "Symes", 7));
		
		//Using For Loop
		System.out.println("Using For Loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		//Using For In Loop
		System.out.println("Using For In Loop");
		for (Person person : people) {
			System.out.println(person);
		}
		
		//Using For Each Loop
		System.out.println("Using Lambda For Each Loop");
		people.forEach(System.out::println);
	}

}
