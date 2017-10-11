package arrayList;

import java.util.ArrayList;

public class MyBasicArrayList {

	public static void main(String[] args) {

		ArrayList<String> elem = new ArrayList<>();

		// Add elements to the arraylist

		elem.add("JAVA");
		elem.add("C");
		elem.add("C++");
		elem.add("C#");

		System.out.println(elem);

		// Index

		System.out.println("Value at Index 1 :- " + elem.get(1));
		System.out.println("Contains Check :- " + elem.contains("C"));

		elem.add(2, "Python");
		
		System.out.println(elem);
		
		System.out.println("Empty Check :- " + elem.isEmpty());
		
		System.out.println("Stream Check :- " + elem.stream());
	}

}
