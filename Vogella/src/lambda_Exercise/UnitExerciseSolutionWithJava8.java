package lambda_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseSolutionWithJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Darwin", 7), new Person("Lewis", "Carol", 70),
				new Person("Thomas", "Creouton", 17), new Person("Michelle", "Symes", 7));

		// Step 1 - Sort list by lastname

		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

	

		// Step 2 - Create a method that prints all elements in the list

		System.out.println("Printing All Persons");
		printConditionally(people, p -> true);

		// Step 3 - Create a method that prints all people that have last name
		// beginning with c


		System.out.println("Printing all Person with last Name C");
		printLastNameBeginningWithLetterC(people);
		
		
		// Step 4 - Print Conditionally
		System.out.println("Printing all Person with First Name ");
		printConditionally(people, p -> p.getLastName().startsWith("D"));
	}

	private static void printLastNameBeginningWithLetterC(List<Person> people) {
		for (Person person : people) {

			if (person.getLastName().startsWith("C")) {
				System.out.println(person);
			}
		}

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {

			if (condition.test(person)) {
				System.out.println(person);
			}
		}

	}



}


