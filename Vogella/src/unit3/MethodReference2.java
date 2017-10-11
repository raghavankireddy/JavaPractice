package unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambda_Exercise.Person;

public class MethodReference2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Darwin", 7), new Person("Lewis", "Carol", 70),
				new Person("Thomas", "Creouton", 17), new Person("Michelle", "Symes", 7));

		// Step 2 - Create a method that prints all elements in the list

		System.out.println("Printing All Persons");
		printConditionally(people, p -> true, System.out::println); // p -> method(p)

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
