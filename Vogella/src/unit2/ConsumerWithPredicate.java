package unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

import lambda_Exercise.Person;

public class ConsumerWithPredicate {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Darwin", 7), new Person("Lewis", "Carol", 70),
				new Person("Thomas", "Creouton", 17), new Person("Michelle", "Symes", 7));

		// Step 1 - Sort list by lastname

		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 - Create a method that prints all elements in the list

		System.out.println("Printing All Persons");
		printConditionally(people, p -> true, p -> System.out.println(p));

		// Step 3 - Create a method that prints all people that have last name
		// beginning with c

		System.out.println("Printing all Person with last Name C");
		printLastNameBeginningWithLetterC(people);

		// Step 4 - Print Conditionally
		System.out.println("Printing all Person with First Name ");
		printConditionally(people, p -> p.getLastName().startsWith("D"), p -> System.out.println(p.getFirstName()));
	}

	private static void printLastNameBeginningWithLetterC(List<Person> people) {
		for (Person person : people) {

			if (person.getLastName().startsWith("C")) {
				System.out.println(person);
			}
		}

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {

			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}

	}

}
